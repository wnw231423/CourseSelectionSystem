package com.wnw.vo;

public class SchoolMember {
    private int id;
    private String name;

    public SchoolMember(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
