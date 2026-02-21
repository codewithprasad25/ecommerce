package com.example.ProductListing.repository;

import com.example.ProductListing.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    Optional<ApplicationUser> findByUserName(String userName);

    boolean existsByUserName(String userName);
}