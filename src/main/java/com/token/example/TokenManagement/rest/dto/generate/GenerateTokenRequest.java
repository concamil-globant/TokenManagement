package com.token.example.TokenManagement.rest.dto.generate;

import com.token.example.TokenManagement.model.RequestingUser;
import lombok.Data;

public interface GenerateTokenRequest {

  @Data
  class GetTokenRequest {

    private String appName;
    private String durationInHours;

    public static RequestingUser toModel(GetTokenRequest request) {
      return RequestingUser.builder()
          .appName(request.appName)
          .durationInHours(request.durationInHours)
          .build();
    }
  }

}
