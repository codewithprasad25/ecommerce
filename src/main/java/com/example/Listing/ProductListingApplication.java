package com.example.ProductListing;

import com.example.ProductListing.model.User;
import com.example.ProductListing.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductListingApplication.class, args);


	}

    @Bean
    CommandLineRunner runner(UserRepo repo) {
        return args -> {
            if(repo.findByUsername("admin").isEmpty()){
                repo.save(User.builder()
                        .username("admin")
                        .password("{noop}admin123")
                        .role("ROLE_ADMIN")
                        .build());
            }
        };
    }

}
