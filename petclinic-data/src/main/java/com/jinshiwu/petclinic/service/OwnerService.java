package com.jinshiwu.petclinic.service;

import com.jinshiwu.petclinic.model.Owner;


/**
 * Created by jinshiwu on 8/16/18.
 */
public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
