package biz.direction.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hw2")
@Scope("prototype")
public class Hello2 {

	public Hello2(){
		System.out.println("hello 2");
	}
	public String sayHello(){
		return "hello world2";
	}
	
}
