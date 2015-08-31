/**
 * 
 */
package main.java;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Nick
 *
 */
public class Mainapp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			ApplicationContext context = new ClassPathXmlApplicationContext("main/resources/spring/spring-bean.xml");
			HelloWorldService hello = (HelloWorldService)context.getBean("helloWorldBean");
			hello.sayHello();
		}catch(BeansException e){
			System.out.println(e.getMessage());
		}
		
	}

}
