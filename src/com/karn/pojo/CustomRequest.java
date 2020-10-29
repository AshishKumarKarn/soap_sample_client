package com.karn.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomRequest implements Serializable{
    private String name;
    private int id;

    public CustomRequest() {
    	
    }
    public CustomRequest(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
