package com.GradleCrudDemo.GradleCrudDemo1.Repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GradleCrudDemo.GradleCrudDemo1.Entity.UserEntity;


@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
