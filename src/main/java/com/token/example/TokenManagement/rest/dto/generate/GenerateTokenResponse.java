package com.token.example.TokenManagement.rest.dto.generate;

import com.token.example.TokenManagement.model.TokenEnvelop;
import lombok.Builder;
import lombok.Data;

public interface GenerateTokenResponse {

  @Data
  @Builder
  class GetTokenResponse {
    private String token;

    public static GetTokenResponse fromModel(final TokenEnvelop tokenEnvelop) {
      return GetTokenResponse.builder()
          .token(tokenEnvelop.getToken())
          .build();
    }
  }
  
}
