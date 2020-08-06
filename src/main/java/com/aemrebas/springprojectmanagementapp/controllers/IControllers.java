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

    Optional<T> getById(final ID id);

    void deleteOneById(final ID id);

    void createOne(final T entity);

    void updateOneById(final ID id, final T updated);


}
