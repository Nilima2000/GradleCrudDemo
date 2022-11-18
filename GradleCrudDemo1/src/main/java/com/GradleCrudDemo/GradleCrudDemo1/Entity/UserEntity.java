package com.GradleCrudDemo.GradleCrudDemo1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_id;
	@Column(name="Name")
	private String Name;
	@Column(name="Salary")
	private int Salary;
	
	public UserEntity(int user_id, String name, int salary) {
		super();
		this.user_id = user_id;
		Name = name;
		Salary = salary;
	}
	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserEntity [user_id=" + user_id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	} 
	
	

}


//user_id	int PK
//Name	varchar(45)
//Salary	varchar(45)
