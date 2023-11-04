package com.jsp.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.jdbc.Dao.CarDao;
import com.jsp.jdbc.Dao.CarDaoimpl;
import com.jsp.jdbc.Entity.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(CarConfig.class);
        CarDao dao=context.getBean("dao",CarDaoimpl.class);
        System.out.println("loadxmlfile");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 insert the values");
        System.out.println("Enter 2 update query");
        int choice=sc.nextInt();
        switch(choice) {
        case 1:
        {
        	Car c=new Car();
        	System.out.println("Enter Car No");
        	c.setCarNo(sc.next());
        	System.out.println("Enter CarName");
        	c.setCarName(sc.next());
        	System.out.println("Enter Car Mileage");
        	c.setMileage(sc.nextDouble());
        	System.out.println("Enter Car Price");
        	c.setPrice(sc.nextDouble());
        	System.out.println("Enter Car color");
        	c.setCarcolor(sc.next());
        	dao.getInsertData(c);
        	System.out.println("Data inserted..!!");
        	break;
        }
        case 2:
        {
        	dao.updatecar();
        	System.out.println("data update....!!");
        	
        }

        }
        
        
       
    }
}
