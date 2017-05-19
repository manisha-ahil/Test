package biz.direction.noconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import biz.direction.demo.Hello;

@Configuration
@ComponentScan(basePackages = "biz.direction.demo")
public class SpringConfig {

	public SpringConfig(){
		System.out.println("this is springconfig");
	}
	
	@Bean(name="hw") 
	public Hello HW(){
		return new Hello();
	}
	
	@Bean 
	public Hello HWID(){
		return new Hello();
	}
}
