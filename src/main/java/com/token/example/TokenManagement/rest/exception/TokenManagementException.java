package com.token.example.TokenManagement.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class TokenManagementException extends RuntimeException {
  public TokenManagementException(String message) {
    super(message);
  }
}
