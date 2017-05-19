package biz.direction.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import biz.direction.demo.Hello;
import biz.direction.demo.Hello2;
import biz.direction.noconfig.SpringConfig;

public class TestWithoutAnnotation {

	@Test
	public void test() {
		//fail("Not yet implemented");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Hello2 hello2 = (Hello2) ctx.getBean("hw2");
		System.out.println(hello2.sayHello());
		
		//for without annotated class
		Hello hel = (Hello) ctx.getBean("hw");
		System.out.println(hel.sayHello());
	}

}
