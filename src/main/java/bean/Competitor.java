/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author dell
 */
public class Competitor {
    private String name;
    private String surName;

    @Override
    public String toString() {
        return "name=" + name + ", surName=" + surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Competitor(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    
}
