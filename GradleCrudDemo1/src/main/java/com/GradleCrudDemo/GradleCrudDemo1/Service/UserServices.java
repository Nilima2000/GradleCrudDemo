package com.GradleCrudDemo.GradleCrudDemo1.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.GradleCrudDemo.GradleCrudDemo1.Entity.UserEntity;
import com.GradleCrudDemo.GradleCrudDemo1.Repository.UserRepository;



public interface UserServices {
	
	
	
	public List<UserEntity> getAllUser();
	public UserEntity getUserById(int user_id);
	public UserEntity addOrUpdateUser(UserEntity userEntity);
	public UserEntity deleteUser(int user_id) throws Exception;
	
}
