package my.simple;

import my.simple.util.HibernateUtil;
import my.simple.domain.CostEntity;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Add new Employee object
        CostEntity c = new CostEntity();
        c.setAmount(123);
        c.setCreateTime(new Date(12, 12, 12));
        c.setObject("Moloko");

        session.save(c);

        session.getTransaction().commit();

        SpringApplication.run(Application.class, args);
    }
}

