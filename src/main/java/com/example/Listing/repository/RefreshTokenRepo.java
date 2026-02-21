package com.example.ProductListing.repository;

import com.example.ProductListing.model.UserRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRefreshTokenRepository extends JpaRepository<UserRefreshToken, Long> {

    Optional<UserRefreshToken> findByRefreshTokenValue(String refreshTokenValue);

    Optional<UserRefreshToken> findByAssociatedUserUserId(Long userId);
}