package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Car;

public class CarRun {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
		System.out.println("Context Loaded!!");

		// Creating Car objects using one bean who has a scope of Prototype
		Car car1 = (Car) context.getBean("car");
		System.out.println(car1);

		Car car2 = (Car) context.getBean("car");
		System.out.println(car2);

		car1.setColor("White");
		System.out.println("Changed car color");
		System.out.println(car1);
		System.out.println(car2);

		// Getting a Car Object using the car factory bean and making the car class as
		// private
		System.out.println("Car Factory Run...");
		Car car3 = (Car) context.getBean("car1");
		System.out.println(car3);
	}
}
