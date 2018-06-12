package com.Dismas.GovnoSoft.Bean;

/**
 * Created by Dmitry on 11.06.2018.
 */
public class Program {
    private int id;
    private String name;
    private String url;
    private String Hash;

    /*public Program(int id, String name, String url, String hash) {
        this.id = id;
        this.name = name;
        this.url = url;
        Hash = hash;
    }*/

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getHash() {
        return Hash;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHash(String hash) {
        Hash = hash;
    }
}
