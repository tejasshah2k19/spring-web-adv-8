package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.SignupBean;
import com.bean.UserBean;

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

	public List<UserBean> getAllUsers() {

		List<UserBean> users = stmt.query("select * from users", new BeanPropertyRowMapper<>(UserBean.class));
		return users;
	}

//	class MyRowMapper implements RowMapper<UserBean> {
//
//		@Override
//		public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
//			UserBean user = new UserBean();
//			user.setFirstName(rs.getString("fname"));
//			return user;
//		}
//
//	}
//user_id 
	// userId

}
