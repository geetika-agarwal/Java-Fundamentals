package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Customer1;

public class Customer1Run {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");

		System.out.println("Context Loaded!!");
		Customer1 cust1 = (Customer1) context.getBean("customer1");
		System.out.println(cust1);
	}
}
