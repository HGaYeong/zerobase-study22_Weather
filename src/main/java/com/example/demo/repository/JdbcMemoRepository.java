package com.example.demo.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.sptingframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcMemoRepository {
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcMemoRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource); 
	}
}
