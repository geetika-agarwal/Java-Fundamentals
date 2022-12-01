package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.anno.beans.Customer;
import com.anno.beans.CustomerConfiguration;

@ComponentScan(basePackages = { "com.anno.beans" })
public class AnnotationConfigurationRun {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);
		Customer c = (Customer) context.getBean("customer123");
		System.out.println(c);
	}
}
