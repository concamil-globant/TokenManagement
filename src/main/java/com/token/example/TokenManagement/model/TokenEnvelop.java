package com.token.example.TokenManagement.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenEnvelop {

  private String token;
  private String appName;
  private boolean validToken;

}
