package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.LifeCycleBean;

public class LifeCycleBeanDemo {
	public static void main(String[] args) {
//		LifeCycleBean c = new LifeCycleBean();
//		c.setBeanName("myUtility");
		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		LifeCycleBean lcb = (LifeCycleBean) context.getBean("life");
		System.out.println("Bean Loaded...");
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
