package com.GradleCrudDemo.GradleCrudDemo1.Service.implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.GradleCrudDemo.GradleCrudDemo1.Entity.UserEntity;
import com.GradleCrudDemo.GradleCrudDemo1.Repository.UserRepository;
import com.GradleCrudDemo.GradleCrudDemo1.Service.UserServices;

@Service
public class UserServiceImpl implements UserServices
{

	@Autowired
	private UserRepository userrepository;
	
	
	@Override
	public List<UserEntity> getAllUser() {
		
		return (List<UserEntity>) userrepository.findAll();
	}

	@Override
	public UserEntity getUserById(int user_id) {
		
		return userrepository.findById(user_id).orElse(null);
	}

	@Override
	public UserEntity addOrUpdateUser(UserEntity userEntity) {
		
		return userrepository.save(userEntity);
	}

	@Override
	public UserEntity deleteUser(int user_id) throws Exception {
		UserEntity deletedUser = null;
		try {
			deletedUser = userrepository.findById(user_id).orElse(null);
			if(deletedUser == null) {
				throw new Exception("user not available");
			}else {
				userrepository.deleteById(user_id);
			}
		}catch(Exception ex) {
			throw ex;
		}
		return deletedUser;
	}
}
