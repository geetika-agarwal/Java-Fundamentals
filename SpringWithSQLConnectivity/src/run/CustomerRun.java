package run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Customer;
import com.anno.beans.CustomerDAO;

public class CustomerRun {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerDAO customerDao = (CustomerDAO) context.getBean("customerDAOSupport");
		// insert into customer
//		Customer c = new Customer();
//		int rows = customerDao.addCustomer(c);
//		System.out.println(rows);

		// delete from customer
//		int rows = customerDao.deleteCustomer(103);
//		System.out.println(rows);

		// update the customer
//		int id = 102;
//		String new_name = "Geetika";
//		int rows = customerDao.updateCustomer(102, new_name);
//		System.out.println(rows);

		// display all the values in the table
		List<Customer> list = customerDao.displayTable();
		for (Customer c : list) {
			System.out.println(c);
		}

	}
}
