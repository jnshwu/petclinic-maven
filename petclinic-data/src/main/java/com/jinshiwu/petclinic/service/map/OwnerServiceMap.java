package com.jinshiwu.petclinic.service.map;

import com.jinshiwu.petclinic.model.Owner;
import com.jinshiwu.petclinic.service.CrudService;
import com.jinshiwu.petclinic.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by EL on 8/26/18.
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
