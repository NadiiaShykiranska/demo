package com.example.bookmarks;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nadiia on 12.12.2015.
 */
@Entity
public class Account {
    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<>();

    @Id
    @GeneratedValue
    private Long id;

    public Set<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @JsonIgnore
    public String password;
    public String username;

    public Account(String password, String username) {
        this.password = password;
        this.username = username;
    }


}
