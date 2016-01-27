package com.app.spring.starter.kitchen;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class KitchenBeanPostProcessor implements BeanPostProcessor, Ordered{

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("Processing bean instance after initialization for: " + arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("Processing bean instance before initialization for: " + arg1);
		return arg0;
	}

	public int getOrder() {
		// A bit less priority than 0
		return 1;
	}

}
