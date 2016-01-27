package com.app.spring.starter;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



//import com.mkyong.config.AppConfig;

import com.app.spring.starter.kitchen.Kitchen;
import com.app.spring.starter.kitchen.PPHCExampleBean;
 
public class App {
	public static void main(String[] args) {
	    
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    Kitchen kitchen1 = (Kitchen) context.getBean("homeKitchen");
	    
//	    kitchen1.setHello("Hello from PROTOTYPE!"); Exemplifies initialization of prototype bean
	    kitchen1.printHelloWorld();
	    kitchen1.getMashThing().mash();
	    
	    System.out.println(kitchen1.kitchenWareList);
	    
	    System.out.println("\nInstantiating new Kitchen object...");
	    Kitchen kitchen2 = (Kitchen) context.getBean("homeKitchen");
	    kitchen2.printHelloWorld();
	    kitchen2.getMashThing().mash();;
	    System.out.println("homeKitchen is prototype: " + context.isPrototype("homeKitchen"));
	    
	    PPHCExampleBean pphcExample = (PPHCExampleBean) context.getBean("pphcExample");
	    System.out.println("\nPrinting the example value set by using PropertyPlaceholderConfigurer");
	    pphcExample.printExampleValue();
	    
	    //Destroys the beans (end of life cycle for all beans managed by spring.xml
//	    ((AbstractApplicationContext)context).registerShutdownHook();
	}
}