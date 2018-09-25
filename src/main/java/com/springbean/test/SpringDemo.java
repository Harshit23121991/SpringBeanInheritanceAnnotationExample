package com.springbean.test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringDemo {
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
		Elephant elephant = ctx.getBean(Elephant.class);
		System.out.println(elephant.getName());
		System.out.println(elephant.getLocation());
		System.out.println(elephant.getAge());
    	ctx.registerShutdownHook();
	}
} 