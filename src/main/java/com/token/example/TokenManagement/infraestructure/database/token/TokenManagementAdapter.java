package com.token.example.TokenManagement.infraestructure.database.token;

import java.time.LocalDateTime;
import java.util.Optional;
import com.token.example.TokenManagement.model.RequestingUser;
import com.token.example.TokenManagement.model.TokenEnvelop;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TokenManagementAdapter {

  private final TokenManagementRepository repository;

  public void saveCreatedToken(RequestingUser tokenEnvelop, String token) {
    TokenManagementData tokenManagementData = new TokenManagementData();
    tokenManagementData.setToken(token);
    tokenManagementData.setAppName(tokenEnvelop.getAppName());
    tokenManagementData.setCreationDate(LocalDateTime.now());
    tokenManagementData.setExpirationDate(
        LocalDateTime.now().plusHours(Long.parseLong(tokenEnvelop.getDurationInHours())));

    repository.save(tokenManagementData);
  }

  public Optional<TokenManagementData> validateToken(TokenEnvelop tokenEnvelop) {
    return repository.findFirstByTokenAndAppName(tokenEnvelop.getToken(), tokenEnvelop.getAppName());
  }

}
