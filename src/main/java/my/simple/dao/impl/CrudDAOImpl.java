package my.simple.dao.impl;

import my.simple.dao.interfaces.CrudDAO;
import my.simple.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class  CrudDAOImpl implements CrudDAO {

    @Override
    public void add(Object object, Class typeParameterClass) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
    }

    @Override
    public Object getById(int id, Class typeParameterClass) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Object result = session.get(typeParameterClass, id);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
        return result;
    }

    @Override
    public void update(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
    }

    @Override
    public void delete(int id, Class typeParameterClass) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Object del = session.get(typeParameterClass, id);
        session.delete(del);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
    }
}
