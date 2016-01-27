package com.app.spring.starter.kitchen;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Modifies or changes the bean definitions in the spring.xml before the
 * BEFORE the Spring container initializes any of the beans.
 * @author juan.marcos
 *
 */
public class KitchenBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanDefinition)
			throws BeansException {
		
		BeanDefinition bd = beanDefinition.getBeanDefinition("homeKitchen");
		MutablePropertyValues propertyVals = bd.getPropertyValues();
		
		propertyVals.addPropertyValue("hello", "Set From KitchenBeanFactoryPostProcessor!!!");
	}

}
