package com.token.example.TokenManagement.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestingUser {

  private String durationInHours;
  private String appName;

}
