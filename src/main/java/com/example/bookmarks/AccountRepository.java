package com.example.bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Nadiia on 12.12.2015.
 */

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}