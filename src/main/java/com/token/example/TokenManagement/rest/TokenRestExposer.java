package com.token.example.TokenManagement.rest;

import com.token.example.TokenManagement.rest.dto.generate.GenerateTokenRequest;
import com.token.example.TokenManagement.rest.dto.generate.GenerateTokenResponse;
import com.token.example.TokenManagement.rest.dto.validate.ValidateTokenRequest;
import com.token.example.TokenManagement.rest.dto.validate.ValidateTokenResponse;
import com.token.example.TokenManagement.usecase.TokenUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token-management")
public class TokenRestExposer {

  @Autowired
  private TokenUseCase tokenUseCase;


  @RequestMapping(value = "/get-token", method = RequestMethod.POST)
  public ResponseEntity<GenerateTokenResponse.GetTokenResponse> generateToken(
      final @RequestBody GenerateTokenRequest.GetTokenRequest request) {

    return new ResponseEntity<>(
        GenerateTokenResponse.GetTokenResponse
            .fromModel(tokenUseCase
                .generateToken(GenerateTokenRequest.GetTokenRequest.toModel(request))),
        HttpStatus.OK);
  }

  @RequestMapping(value = "/validate-token", method = RequestMethod.POST)
  public ResponseEntity<ValidateTokenResponse.CheckTokenResponse> checkToken(
      final @RequestBody ValidateTokenRequest.CheckTokenRequest request) {

    return new ResponseEntity<>(
        ValidateTokenResponse.CheckTokenResponse
            .fromModel(tokenUseCase
                .checkToken(ValidateTokenRequest.CheckTokenRequest.toModel(request))),
        HttpStatus.OK);
  }

}
