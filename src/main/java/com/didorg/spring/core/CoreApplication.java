package com.didorg.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.didorg.spring.core.bean.Assistant;
import com.didorg.spring.core.bean.Customer;
import com.didorg.spring.core.bean.Product;
import com.didorg.spring.core.javaconfig.CustomerConfiguration;

public class CoreApplication {

	public static void main(String[] args) {
		//1. Instantiate the Spring Container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext confContext = new AnnotationConfigApplicationContext(CustomerConfiguration.class);
		
		//2. Get the bean information from Spring IoC
		//XmlApplicationContex
		Product product = context.getBean("product", Product.class);
		Assistant assistant = context.getBean("assistant", Assistant.class);
		//AnnotationConfigApplicationContext
		Customer customer = confContext.getBean("customer", Customer.class);
		
		
		//3. Use the bean
		System.out.println(product);
		System.out.println(customer);
		System.out.println(assistant);
		
		
		//Close the ApplicationContext
		((AbstractApplicationContext) context).close();
		((AbstractApplicationContext) confContext).close();
	}

}
