package com.app.spring.starter.kitchen;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class SecondBeanPostProcessor implements BeanPostProcessor, Ordered{

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("SecondBeanPostProcessor's AFTER init for: " + arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("SecondBeanPosrProcessor's BEFORE init for: " + arg1);
		return arg0;
	}

	public int getOrder() {
		// 0 provides highest priority for this class
		return 0;
	}

}
