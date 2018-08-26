package com.jinshiwu.petclinic.service.map;

import com.jinshiwu.petclinic.model.Pet;
import com.jinshiwu.petclinic.service.CrudService;

import java.util.Set;

/**
 * Created by EL on 8/26/18.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService <Pet, Long>{
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
