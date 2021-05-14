package com.token.example.TokenManagement.infraestructure.token;

import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class TokenFactory {

  public static String generateUUIDToken() {
    return UUID.randomUUID().toString();
  }

}
