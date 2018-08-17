package com.jinshiwu.petclinic.model;

/**
 * Created by jinshiwu on 8/15/18.
 */
public class PetType extends BaseEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
