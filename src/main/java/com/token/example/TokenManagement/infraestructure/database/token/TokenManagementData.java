package com.token.example.TokenManagement.infraestructure.database.token;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tokenmanagement")
public class TokenManagementData {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long tokenId;

  @Column(name = "token_data")
  private String token;

  @Column(name = "creation_date")
  private Date creationDate;


  @Column(name = "expiration_date")
  private Date expirationDate;

  @Column(name = "token_signer")
  private String signer;

}
