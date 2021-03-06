package com.ty.foodapp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty.foodapp")
public class MyConfig {

	@Bean("entityManagerFactory")
	EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("vikas") ;
	}
}

