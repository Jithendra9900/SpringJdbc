package com.jsp.jdbc;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jsp.jdbc.Dao.CarDao;
import com.jsp.jdbc.Dao.CarDaoimpl;
import com.jsp.jdbc.Entity.Car;
@Configurable
@ComponentScan(basePackages = "com.jsp.jdbc")
public class CarConfig 
{
	@Bean
	public JdbcTemplate getJdbcTemplate() 
	{
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(getDriverManagerDataSource());
		return jt;
	}
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource()
	{
		DriverManagerDataSource dm=new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3307/teca41");
		dm.setUsername("root");
		dm.setPassword("12345");
		return dm;
		
	}
	@Bean("dao")
	public CarDao getCarDaoObject() 
	{
		CarDaoimpl dao=new CarDaoimpl();
		dao.setJdbcTemplate(getJdbcTemplate());
		return dao;
		
	}
	
		
   

 
}
