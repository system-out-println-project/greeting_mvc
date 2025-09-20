package org.example;

import org.example.model.Greeting;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public SessionFactory sessionFactory() {
		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Greeting.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}
}
