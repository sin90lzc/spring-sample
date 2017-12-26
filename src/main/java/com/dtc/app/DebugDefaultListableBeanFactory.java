package com.dtc.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DebugDefaultListableBeanFactory {

	private static final Logger logger=LogManager.getLogger();
	
	public static void main(String[] args) {
		logger.debug("start debug BeanFactory implement!");
		Resource resource=new ClassPathResource("spring/application-context.xml");
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		BeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		factory.getBean("orderService");
	}

}
