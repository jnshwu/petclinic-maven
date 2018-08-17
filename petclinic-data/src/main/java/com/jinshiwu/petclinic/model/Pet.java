package com.jinshiwu.petclinic.model;

import java.time.LocalDate;

/**
 * Created by jinshiwu on 8/15/18.
 */
public class Pet extends BaseEntity{
    private PetType petType;
    private Owner owner;
    private LocalDate brithDate;
}
