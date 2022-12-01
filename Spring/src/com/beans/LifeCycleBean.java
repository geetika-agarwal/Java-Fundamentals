package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, InitializingBean
//, DisposableBean 
{

	BeanFactory beanFactory = null;

//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Destroy Method Called...");
//	}

	public void preDestroy() {
		System.out.println("Calling Pre Destroy...");
	}

	public void globalDestroy() {
		System.out.println("Calling Global Destroy...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("afterPropertiesSet() is invoked...");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.beanFactory = beanFactory;
		System.out.println("Bean Factory Instantiated...");
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName() is invoked...");
	}

}
