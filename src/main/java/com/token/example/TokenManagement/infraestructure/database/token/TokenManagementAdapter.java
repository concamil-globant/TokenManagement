package com.token.example.TokenManagement.infraestructure.database.token;

import com.token.example.TokenManagement.model.TokenEnvelop;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TokenManagementAdapter {

  private final TokenManagementRepository repository;

  public void saveCreatedToken(TokenEnvelop tokenEnvelop) {

  }

  public boolean validateTOken(TokenEnvelop tokenEnvelop) {

    return false;
  }

}
