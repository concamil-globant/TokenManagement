package com.token.example.TokenManagement.infraestructure.database.token;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenManagementRepository extends JpaRepository<TokenManagementData, Long> {
}
