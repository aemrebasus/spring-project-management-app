package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.services.IService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BaseController<T, ID extends Long, S> implements IController<T, ID> {
    protected IService<T> service;

    @Override
    public List<T> getAll() {
        return service.findAll();
    }

    @Override
    public Optional<T> getById(ID id) {
        return service.findById(id);
    }

    @Override
    public void deleteOneById(ID id) {
        service.deleteById(id);
    }

    @Override
    public void createOne(T entity) {
        service.saveOne(entity);
    }

    @Override
    public void updateOneById(ID id, T updated) {
        T existing = service.findById(id).get();
        BeanUtils.copyProperties(updated, existing, "id");
    }
}
