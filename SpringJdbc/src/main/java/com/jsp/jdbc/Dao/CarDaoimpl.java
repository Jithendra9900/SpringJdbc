package com.jsp.jdbc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jsp.jdbc.Entity.Car;

public class CarDaoimpl implements CarDao
{
    @Autowired
	private JdbcTemplate template;
   
	public void setJdbcTemplate( JdbcTemplate template) 
	{
		this.template=template;
		
	}

	@Override
	public void getInsertData(Car car) 
	{
		String query="insert into car values(?,?,?,?,?)";
	
		template.update(query,car.getCarNo(),car.getCarName(),car.getMileage(),car.getPrice(),car.getCarcolor());
		
	}

	@Override
	public void updatecar() {
		String update="update car set price=500000.0 where carNo='Ap5103'";
		template.update(update);
		
	}
	
   
	




}
