package com.registro.comercio.Commons;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public abstract class GenericServiceImpl <T, ID extends Serializable> implements GenericServiceAPI<T, ID>{
    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public T get(ID id) {
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    public  abstract CrudRepository<T,ID> getDao();
}
