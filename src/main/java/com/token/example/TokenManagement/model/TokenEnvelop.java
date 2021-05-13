package com.token.example.TokenManagement.model;

import lombok.Data;

@Data
public class TokenEnvelop {

  private String token;
  private String signed;
  private String user;

}
