package com.hibernate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyHibernate3App {
    private static final Logger logger = LogManager.getLogger(MyHibernate3App.class);

    public static void main(String[] args) {
        logger.info("MyHibernate3App Running.....");
        // Create a Hibernate configuration
//        Configuration configuration = new Configuration();
        Configuration configuration = new Configuration();
        configuration.configure(); // Load hibernate.cfg.xml (assumes it's in the classpath)

        // Build a SessionFactory based on the configuration
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open a session
        Session session = sessionFactory.openSession();

        // Perform database operations (in-memory)
        Transaction transaction = session.beginTransaction();

        // Create and save an example entity (without database connection)
        ExampleEntity entity = new ExampleEntity();

        entity.setName("John Doe");
        session.save(entity);

        transaction.commit();

        // Close the session and session factory
        session.close();
        sessionFactory.close();
    }
}
