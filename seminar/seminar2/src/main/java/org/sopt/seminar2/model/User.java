package org.sopt.seminar2.model;

public class User {

    private String name;
    private String part;

    public User() {
    }

    public User(String name, String part) {
        this.name = name;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }




}
