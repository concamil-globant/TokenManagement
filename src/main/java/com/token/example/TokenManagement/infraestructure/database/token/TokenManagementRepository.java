package com.token.example.TokenManagement.infraestructure.database.token;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenManagementRepository extends JpaRepository<TokenManagementData, Long> {

  Optional<TokenManagementData> findFirstByTokenAndAppName(String token, String appName);

}
