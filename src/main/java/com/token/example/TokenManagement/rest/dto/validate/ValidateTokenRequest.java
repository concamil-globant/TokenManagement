package com.token.example.TokenManagement.rest.dto.validate;

import com.token.example.TokenManagement.model.TokenEnvelop;
import lombok.Data;

public interface ValidateTokenRequest {

  @Data
  class CheckTokenRequest {
    private String token;
    private String appName;

    public static TokenEnvelop toModel(CheckTokenRequest request) {
      return TokenEnvelop.builder()
          .token(request.getToken())
          .appName(request.getAppName())
          .build();
    }
  }


}
