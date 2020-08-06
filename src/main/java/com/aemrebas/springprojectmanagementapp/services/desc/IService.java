package com.aemrebas.springprojectmanagementapp.services.desc;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import java.util.List;
import java.util.Optional;

public interface IService<T, ID> {
    List<T> findAll();

    Optional<T> findById(ID id);

    void saveOne(T entity);

    void updateOneById(ID id, T entity);

    void deleteById(ID id);

}
