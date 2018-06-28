package com.howto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howto.model.Employee;
import com.howto.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//http://websystique.com/spring/spring4-hibernate4-mysql-maven-integration-example-using-annotations/
        
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService service = (EmployeeService) context.getBean("employeeService");
        Employee employee1 = new Employee();
        employee1.setName("Han Yenn");
        employee1.setJoiningDate(new Date(2010, 10, 10));
        employee1.setSalary(new BigDecimal(10000));
        employee1.setSsn("ssn00000001");
        
        service.saveEmployee(employee1);
        
        System.out.println( "Hello World!" );
    }
}
