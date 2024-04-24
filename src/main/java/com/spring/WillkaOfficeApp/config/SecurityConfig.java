package com.spring.WillkaOfficeApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    SecurityFilterChain filterChain(HttpSecurity http)throws  Exception{
        return  http
                .formLogin(form->form.loginPage("/Login").permitAll())
                .authorizeHttpRequests(auth->auth.anyRequest().authenticated())
                .build();
    }
}
