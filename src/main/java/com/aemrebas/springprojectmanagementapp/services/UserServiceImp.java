package com.aemrebas.springprojectmanagementapp.services;
/**
 * @project spring-project-management-app
 * @author Ahmet Emrebas on 8/5/2020
 * @since 1.0.0
 */

import com.aemrebas.springprojectmanagementapp.domain.User;
import com.aemrebas.springprojectmanagementapp.repositories.UserRepository;
import com.aemrebas.springprojectmanagementapp.services.core.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceImp implements UserService<Long> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }


    @Override
    public List<User> findByOrganizationId(Long id) {
        return userRepository.findByOrganizationId(id);
    }

    @Override
    public List<User> findByOrganizationName(String name) {
        return userRepository.findByOrganizationName(name);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findByEmailContains(String email) {
        return userRepository.findByEmailContains(email);
    }

    @Override
    public List<User> findByFirstName(String firstName) {
        return userRepository.findByFirstNameContains(firstName);
    }

    @Override
    public List<User> findByLastName(String lastName) {
        return userRepository.findByLastNameContains(lastName);
    }

    @Override
    public List<User> findByUserRolesName(String name) {
        return userRepository.findByUserRolesName(name);
    }

    @Override
    public void saveOne(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateOneById(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id).get();
        BeanUtils.copyProperties(updatedUser, existingUser, "id");
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}
