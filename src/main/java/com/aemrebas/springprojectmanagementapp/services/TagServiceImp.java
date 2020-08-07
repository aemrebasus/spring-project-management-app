package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Tag;
import com.aemrebas.springprojectmanagementapp.repositories.TagRepository;
import com.aemrebas.springprojectmanagementapp.services.core.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("tagService")
public class TagServiceImp implements TagService<Long> {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public List<Tag> findByIssueId(Long id) {
        return tagRepository.findAllByIssuesId(id);
    }

    @Override
    public List<Tag> findByName(String name) {
        return tagRepository.findAllByName(name);
    }

    @Override
    public List<Tag> findByIssueTitle(String title) {
        return tagRepository.findAllByIssuesTitleContains(title);
    }

    @Override
    public List<Tag> findByIssueDescription(String description) {
        return tagRepository.findAllByIssuesDescriptionContains(description);
    }

    @Override
    public List<Tag> findByMessageId(Long id) {
        return tagRepository.findAllByMessagesId(id);
    }

    @Override
    public List<Tag> findByMessageSubject(String subject) {
        return tagRepository.findAllByMessagesSubjectContains(subject);
    }

    @Override
    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public Optional<Tag> findById(Long id) {
        return tagRepository.findById(id);
    }

    @Override
    public void saveOne(Tag tag) {
        tagRepository.save(tag);
    }

    @Override
    public void updateOneById(Long id, Tag updated) {
        Tag existingTag = tagRepository.findById(id).get();
        BeanUtils.copyProperties(updated, existingTag, "id");
    }

    @Override
    public void deleteById(Long id) {
        tagRepository.deleteById(id);
    }
}
