package com.jinshiwu.petclinic.service;

import com.jinshiwu.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by jinshiwu on 8/16/18.
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
