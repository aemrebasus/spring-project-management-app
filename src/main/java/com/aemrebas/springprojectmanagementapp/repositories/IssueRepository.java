package com.aemrebas.springprojectmanagementapp.repositories;

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Long> {
}
