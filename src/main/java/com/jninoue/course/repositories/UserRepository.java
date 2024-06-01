package com.jninoue.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jninoue.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
