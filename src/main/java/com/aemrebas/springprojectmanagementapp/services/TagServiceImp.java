package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Tag;
import com.aemrebas.springprojectmanagementapp.services.desc.TagService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("tagService")
public class TagServiceImp implements TagService<Long> {

    @Override
    public List<Tag> findAllTagsByIssueId(Long aLong) {
        return null;
    }

    @Override
    public List<Tag> findAll() {
        return null;
    }

    @Override
    public Optional<Tag> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void saveOne(Tag entity) {

    }

    @Override
    public void updateOneById(Long aLong, Tag entity) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
