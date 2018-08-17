package com.jinshiwu.petclinic.service;

import com.jinshiwu.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by jinshiwu on 8/16/18.
 */
public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
