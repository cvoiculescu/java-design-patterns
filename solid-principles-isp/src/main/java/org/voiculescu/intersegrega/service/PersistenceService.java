package org.voiculescu.intersegrega.service;

import org.voiculescu.intersegrega.entity.Entity;

import java.util.Map;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

    Map<Long, T> getCache();

    public default void save(T entity) {
        Map<Long, T> cache = getCache();
        synchronized (cache) {
            cache.put(entity.getId(), entity);
        }
    }

    default void delete(T entity) {
        Map<Long, T> cache = getCache();
        synchronized (cache) {
            cache.remove(entity.getId());
        }
    }

    default T findById(Long id) {
        Map<Long, T> cache = getCache();
        synchronized (cache) {
            return cache.get(id);
        }
    }

}
