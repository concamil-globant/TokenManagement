package com.token.example.TokenManagement.infraestructure.database.token;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "token")
public class TokenManagementData {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long tokenId;
  private String token;
  private LocalDateTime creationDate;
  private LocalDateTime expirationDate;
  private String appName;

}
