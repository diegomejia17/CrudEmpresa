package com.registro.comercio.Commons;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericServiceImpl <T, ID extends Serializable> implements GenericServiceAPI<T, ID>{
    @Override
    public T save(T entity) {
        return getDao().save(entity);
    }

    @Override
    public void delete(ID id) {
        getDao().deleteById(id);

    }

    @Override
    public T get(ID id) {
        return getDao().findById(id).orElse(null);
    }

    @Override
    public List<T> getAll() {
        List<T> list = new ArrayList<>();
        getDao().findAll().forEach(list::add);
        return list;
    }

    public  abstract CrudRepository<T,ID> getDao();
}
