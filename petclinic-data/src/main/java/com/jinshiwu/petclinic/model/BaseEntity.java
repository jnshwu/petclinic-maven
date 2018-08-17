package com.jinshiwu.petclinic.model;

import java.io.Serializable;

/**
 * Created by jinshiwu on 8/16/18.
 */
public class BaseEntity implements Serializable{
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
