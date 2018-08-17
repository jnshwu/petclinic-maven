package com.jinshiwu.petclinic.service;

import com.jinshiwu.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by jinshiwu on 8/16/18.
 */
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
