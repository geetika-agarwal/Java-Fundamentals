package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Customer;

public class AnnotationCustomerRun {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

		Customer c = (Customer) context.getBean("customer1");
		System.out.println(c);
		System.out.println(c.getAddress().getCity());
		System.out.println(c.getAddress().getState());
//		Customer c1 = (Customer) context.getBean("customer");
//		System.out.println(c1);
	}
}
