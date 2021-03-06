package edu.hm.cs.iua.models;

import edu.hm.cs.iua.utils.TokenGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Token {

    private static final TokenGenerator generator = new TokenGenerator();

    @Id
    private Long id;
    private String key;

    public Token() {}

    public Token(Long id) {
        this(id, generator.nextToken());
    }

    public Token(Long id, String key) {
        this.id = id;
        this.key = key;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String token) {
        this.key = token;
    }

}