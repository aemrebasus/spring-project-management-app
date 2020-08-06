package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MockData {
    // TODO: Create List of each Entity above. They will be used inside the corresponding TestClass
    private List<Organization> orgs = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<UserRole> roles = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Issue> issues = new ArrayList<>();
    private List<Tag> tags = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();
    private List<Message> msgs = new ArrayList<>();

    List<User> generateTestData() {
        // TODO: Generating the testdata
        // @important: Never set null to any field because Gson library ignores it and return empty.

        repeat(10, () -> orgs.add(new Organization((long) rnd(), "" + rnd())));
        repeat(10, () -> projects.add(new Project((long) rnd(), "" + rnd(), "" + rnd(), LocalDateTime.now(), orgs.get(rnd(10)))));
        repeat(10, () -> roles.add(new UserRole((long) rnd(), "" + rnd(), new ArrayList<User>())));
        repeat(10, () -> users.add(new User((long) rnd(), "" + rnd(), "", rnd() + "", rnd() + "", roles.subList(0, rnd(10)), orgs.get(rnd(10)))));
        repeat(10, () -> issues.add(new Issue((long) rnd(), "" + rnd(), "" + rnd(), LocalDateTime.now(), tags, users.get(rnd(10)), projects.get(rnd(10)))));
        repeat(10, () -> comments.add(new Comment((long) rnd(), "" + rnd(), LocalDateTime.now(), users.get(rnd(10)), issues.get(rnd(10)))));
        repeat(10, () -> msgs.add(new Message((long) rnd(), "Subject:" + rnd(), "Content:" + rnd(), LocalDateTime.now(), MESSAGE_STATUS.PENDING, users.get(rnd(10)), users.get(rnd(10)))));

        return users;
    }

    void deleteTestData() {
        users = new ArrayList<>();
        issues = new ArrayList<>();
        msgs = new ArrayList<>();
    }

    List<User> getUsers() {
        return users;
    }

    private int rnd() {
        return rnd(9000);
    }

    private int rnd(int limit) {
        return (int) Math.floor(Math.random() * limit);
    }

    interface RepeatFunction {
        void run();
    }

    private void repeat(int number, RepeatFunction functionalInterface) {
        if (number > 100) {
            System.out.println("[TEST DATA] number must be in range between 0 and 100");
            return;
        }
        for (int i = 0; i < number; i++) {
            functionalInterface.run();
        }
    }


}
