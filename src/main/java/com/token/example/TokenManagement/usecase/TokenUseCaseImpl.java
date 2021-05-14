package com.token.example.TokenManagement.usecase;

import java.time.LocalDateTime;
import java.util.Optional;
import com.token.example.TokenManagement.infraestructure.database.token.TokenManagementAdapter;
import com.token.example.TokenManagement.infraestructure.database.token.TokenManagementData;
import com.token.example.TokenManagement.infraestructure.token.TokenFactory;
import com.token.example.TokenManagement.model.RequestingUser;
import com.token.example.TokenManagement.model.TokenEnvelop;
import com.token.example.TokenManagement.rest.exception.TokenManagementException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class TokenUseCaseImpl implements TokenUseCase {

  @Autowired
  TokenManagementAdapter adapter;

  @Override
  public TokenEnvelop generateToken(RequestingUser requestingUser) {
    try {
      String token = TokenFactory.generateUUIDToken();
      adapter.saveCreatedToken(requestingUser, token);
      return generateResponse(token, requestingUser.getAppName());
    } catch (Exception e) {
      throw new TokenManagementException("Error Generating Token, Detail > {}" + e.getMessage());
    }
  }

  @Override
  public TokenEnvelop checkToken(TokenEnvelop tokenEnvelop) {
    try {
      Optional<TokenManagementData> tokenValidation = adapter.validateToken(tokenEnvelop);
      if (tokenValidation.isPresent()) {

        if (tokenValidation.get().getExpirationDate().isAfter(LocalDateTime.now())) {
          return generateResponse("Valid Token", tokenEnvelop.getAppName(), true);
        } else {
          return generateResponse("Expired Token", tokenEnvelop.getAppName(), true);
        }

      } else {
        return generateResponse("Denied, Invalid Token", tokenEnvelop.getAppName(), false);
      }

    } catch (Exception e) {
      throw new TokenManagementException("Error Validating Token, Detail > {}" + e.getMessage());
    }
  }

  private TokenEnvelop generateResponse(String token, String appName) {
    return TokenEnvelop.builder()
        .token(token)
        .appName(appName)
        .build();
  }

  private TokenEnvelop generateResponse(String token, String appName, boolean validToken) {
    return TokenEnvelop.builder()
        .token(token)
        .appName(appName)
        .validToken(validToken)
        .build();
  }
}
