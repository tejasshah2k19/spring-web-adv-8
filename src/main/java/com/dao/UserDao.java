package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.SignupBean;

@Repository
public class UserDao {
	// singleton -> 1 object --> no new --> ioc

	// 4 type
	// 1 Controller
	// 2 Repository
	// 3 Service
	// 4 Component

	// dbConnection

	// driver jar
	// driver class url username password
	@Autowired
	JdbcTemplate stmt;

	public void addUser(SignupBean sBean) {
		stmt.update("insert into users (firstName,email,password) values (?,?,?)", sBean.getFirstName(),
				sBean.getEmail(), sBean.getPassword());
	}

}
