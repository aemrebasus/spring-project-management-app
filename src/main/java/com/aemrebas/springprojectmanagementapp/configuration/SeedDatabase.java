package com.aemrebas.springprojectmanagementapp.configuration;

import com.aemrebas.springprojectmanagementapp.domain.Organization;
import com.aemrebas.springprojectmanagementapp.domain.Tag;
import com.aemrebas.springprojectmanagementapp.domain.User;
import com.aemrebas.springprojectmanagementapp.repositories.OrganizationRepository;
import com.aemrebas.springprojectmanagementapp.repositories.TagRepository;
import com.aemrebas.springprojectmanagementapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedDatabase implements CommandLineRunner {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TagRepository tagRepository;

    @Override
    public void run(String... args) throws Exception {

        Organization o1 = new Organization(null, "KingOFKings");
        this.organizationRepository.save(o1);
        this.organizationRepository.save(new Organization(null, "Double It "));
        this.organizationRepository.save(new Organization(null, "Plural Guys"));
//
        Tag tag = new Tag(null, "AHmet", null);
        this.tagRepository.save(tag);

        User u1 = new User();
        u1.setFirstName("Ahmet");
        u1.setPassword("Password");
        u1.setOrganization(o1);
        u1.setLastName("emrebas");

        this.userRepository.save(u1);
    }
}
