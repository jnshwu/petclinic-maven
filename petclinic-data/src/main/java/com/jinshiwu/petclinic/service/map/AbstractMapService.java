package com.jinshiwu.petclinic.service.map;

import java.util.*;

/**
 * Created by EL on 8/26/18.
 */
public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(Long id){
        return map.get(id);
    }

    T save(ID id, T object) {
        map.put(id, object);

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
