package com.example.bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Nadiia on 12.12.2015.
 */
@Entity
public class Bookmark {

    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    public Bookmark(Account account, String uri, String description) {
        this.account = account;
        this.uri = uri;
        this.description = description;
    }

    public String uri;
    public String description;

    public String getDescription() {
        return description;
    }

    public String getUri() {
        return uri;
    }

    public Long getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }
}
