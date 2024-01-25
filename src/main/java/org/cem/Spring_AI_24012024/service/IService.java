package org.cem.Spring_AI_24012024.service;

import org.cem.Spring_AI_24012024.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IService<T,ID> {
    T save(T t);
    T update(T t);
    Iterable<T> saveAll(Iterable<T> t);
    List<T> findAll();
    void deleteById(ID id);
    void delete(T t);
    Optional<T> findById(ID id);

}
