package com.jinshiwu.petclinic.model;

/**
 * Created by jinshiwu on 8/15/18.
 */
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
