package biz.direction.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.direction.demo.Hello;
import biz.direction.demo.Hello2;

public class HelloTestCode {

	@Test
	public void test() {
		//fail("Not yet implemented");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		// below line wud create bean of hello class
		Hello hello = (Hello) ctx.getBean("hw");
		System.out.println(hello.sayHello());
		
		//prototype scope
		for(int i=1; i<=2 ;i++){
			Hello2 hello2 = (Hello2) ctx.getBean("hw2");
			System.out.println(hello2.sayHello());
		}
		
	}

}
