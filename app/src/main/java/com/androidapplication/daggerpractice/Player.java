package com.androidapplication.daggerpractice;

public class Player {
    private String name;
    private String club;

    public Player() {
    }

    public Player(String name, String club) {
        this.name = name;
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
