package com.token.example.TokenManagement.rest.dto.validate;

import com.token.example.TokenManagement.model.TokenEnvelop;
import lombok.Builder;
import lombok.Data;

public interface ValidateTokenResponse {

  @Data
  @Builder
  class CheckTokenResponse {

    private boolean isValidToken;
    private String token;

    public static CheckTokenResponse fromModel(TokenEnvelop envelop) {
      return CheckTokenResponse.builder()
          .isValidToken(envelop.isValidToken())
          .token(envelop.getToken())
          .build();
    }
  }


}
