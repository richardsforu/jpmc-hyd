package com.cts.employee.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.cts.employee.dao", "com.cts.employee.service" })
@PropertySource(value = { "application.properties" })
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl(env.getProperty("url"));
		dmds.setUsername(env.getProperty("dbuser"));
		dmds.setPassword(env.getProperty("dbpassword"));
		dmds.setDriverClassName(env.getProperty("dbdriver"));

		return dmds;
	}

	@Bean
	public JdbcTemplate getjdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDataSource());

		return jt;
	}

}
