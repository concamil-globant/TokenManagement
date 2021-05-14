package com.token.example.TokenManagement.usecase;

import com.token.example.TokenManagement.model.RequestingUser;
import com.token.example.TokenManagement.model.TokenEnvelop;

public interface TokenUseCase {

  TokenEnvelop generateToken(RequestingUser requestingUser);

  TokenEnvelop checkToken(TokenEnvelop tokenEnvelop);

}
