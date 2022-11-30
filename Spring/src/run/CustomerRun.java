package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Customer;

public class CustomerRun {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cust.xml");
		System.out.println("Application Context loaded");
		Customer c1 = (Customer) context.getBean("cust1");
		System.out.println(c1);
	}
}
