package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import java.util.List;
import java.util.Optional;

public interface IControllers<T, ID extends Long> {

    List<T> getAll();

    Optional<T> getById(ID id);

    void deleteOneById(ID id);

    void createOne(T entity);

    void updateOneById(ID id, T updated);


}
