package com.jinshiwu.petclinic.service.map;

import com.jinshiwu.petclinic.model.Vet;
import com.jinshiwu.petclinic.service.CrudService;
import com.jinshiwu.petclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by EL on 8/26/18.
 */
@Service
public class VetServiceMap extends AbstractMapService <Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }
}
