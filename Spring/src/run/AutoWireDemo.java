package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiring.beans.Employee;

public class AutoWireDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");

		Employee employeeOne = (Employee) context.getBean("employeeOne");

		System.out.println(employeeOne);

		Employee employeeTwo = (Employee) context.getBean("employeeTwo");

		System.out.println(employeeTwo);
	}
}
