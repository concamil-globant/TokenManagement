package com.token.example.TokenManagement.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token-management")
public class RestExposer {

  @RequestMapping(value = "/get-token", method = RequestMethod.GET)
  public ResponseEntity<String> getAnonymous() {
    return ResponseEntity.ok("Hello Anonymous");
  }

  @RequestMapping(value = "/validate-token", method = RequestMethod.GET)
  public ResponseEntity<String> getAllUser() {
    return ResponseEntity.ok("Hello All User");
  }

}
