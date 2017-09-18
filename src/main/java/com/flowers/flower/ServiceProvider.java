package com.flowers.flower;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ServiceProvider {
	private static Session session;
	private static Configuration configuration;
	
	private ServiceProvider() { }
	
	static {
		
		configuration = new Configuration()
	    
		.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
	    .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
	    .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/flowershop")
	    .setProperty("hibernate.connection.username", "root")
	    .setProperty("hibernate.connection.password", "5132")
	    .setProperty("hibernate.show_sql", "true")
	    .setProperty("hibernate.hbm2ddl.auto", "update")
	    
	    // Your Mapping Class
	    .addAnnotatedClass(Flowershop.class)
	    .addAnnotatedClass(Manager.class)
	    .addAnnotatedClass(Flower.class);
	}
	
	
	public static Session getSession() {
	
		SessionFactory factory = configuration.buildSessionFactory();
		session = factory.openSession();
		return session;
	}

}
