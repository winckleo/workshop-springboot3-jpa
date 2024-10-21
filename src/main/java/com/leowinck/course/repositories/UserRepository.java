package com.leowinck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leowinck.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
