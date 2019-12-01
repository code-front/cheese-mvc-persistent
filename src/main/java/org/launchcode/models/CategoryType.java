package org.launchcode.models;


public enum CategoryType {

    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake");

    private final String name;

    CategoryType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}