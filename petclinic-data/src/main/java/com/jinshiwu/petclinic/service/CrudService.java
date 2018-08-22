package com.jinshiwu.petclinic.service;

import com.jinshiwu.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by EL on 8/21/18.
 */
public interface CrudService <T, ID> {
    T findById(Long id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
