package com.example.bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by Nadiia on 12.12.2015.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark,Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
