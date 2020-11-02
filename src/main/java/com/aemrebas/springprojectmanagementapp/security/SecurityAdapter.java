package com.aemrebas.springprojectmanagementapp.security;

import com.aemrebas.springprojectmanagementapp.configuration.RestfullProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 9/1/2020
 @since 1.0.0 
*/
@Configuration
@EnableWebSecurity
public class SecurityAdapter extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    RestfullProperties props;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
//                .antMatchers(props.users).hasAnyAuthority("ADMIN")
                .antMatchers(props.projects).hasAnyAuthority("ADMIN", "SCRUM MASTER")
                .antMatchers(props.issues, props.tags, props.comments).hasAnyAuthority("ADMIN", "SCRUM MASTER", "DEVELOPER")

                .and().authorizeRequests().anyRequest().authenticated()
                .and().formLogin();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
