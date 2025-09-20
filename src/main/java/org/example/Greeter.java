package org.example;

import org.example.model.Greeting;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("org.example.model.Greeting.language")
@Transactional
public class Greeter {
	@Autowired
	private SessionFactory sessionFactory;

	public Greeting getGreeting(long languageCode) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Greeting gt = null;
		switch ((int)languageCode) {
			case 1:
				gt = session.get(Greeting.class, languageCode);
				break;
			case 2:
				gt = session.get(Greeting.class, languageCode);
				break;
			case 3:
				gt = session.get(Greeting.class, languageCode);
				break;
			case 4:
				gt = session.get(Greeting.class, languageCode);
				break;
			default:
				Greeting defaultGreeting = new Greeting();
				defaultGreeting.setGreeting("Καλημέρα");
				return defaultGreeting;
		}
		
		tx.commit();
		return gt;
	}
}
