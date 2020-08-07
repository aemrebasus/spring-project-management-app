package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TagRepository extends JpaRepository<Tag, Long> {

    List<Tag> findAllByName(String name);

    List<Tag> findAllByNameContains(String name);

    List<Tag> findAllByIssuesId(Long id);

    List<Tag> findAllByIssuesTitleContains(String title);

    List<Tag> findAllByIssuesDescriptionContains(String description);

    List<Tag> findAllByMessagesId(Long id);

    List<Tag> findAllByMessagesSubjectContains(String subject);

    List<Tag> findAllByMessagesContentContains(String content);

}


