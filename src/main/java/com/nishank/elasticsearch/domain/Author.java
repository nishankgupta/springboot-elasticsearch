package com.nishank.elasticsearch.domain;

public class Author {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "{'name':'"+name+"'}";
    }
}
