package com.GradleCrudDemo.GradleCrudDemo1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GradleCrudDemo.GradleCrudDemo1.Entity.UserEntity;
import com.GradleCrudDemo.GradleCrudDemo1.Service.UserServices;


@RestController

public class UserController {
	
	
	@Autowired
	private UserServices userService;
	
//	@GetMapping("/home")
//	public String home()
//	{
//		
//		return "Welcome of the Gradle application";
//		
//	}
	@GetMapping("/allUsers")
	public ResponseEntity<List<UserEntity>> getAllUsers(){
		List<UserEntity> users = null;
		try {
			users = userService.getAllUser();
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<UserEntity>>(users, HttpStatus.OK);


}
}
