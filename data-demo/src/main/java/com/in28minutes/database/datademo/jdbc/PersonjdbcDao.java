package com.in28minutes.database.datademo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.datademo.entity.Person;

@Repository
public class PersonjdbcDao {
	@Autowired
	JdbcTemplate jadbcTemplate;
	public List<Person> findAll(){
		return jadbcTemplate.query("select* from person",new BeanPropertyRowMapper(Person.class));
	}

}