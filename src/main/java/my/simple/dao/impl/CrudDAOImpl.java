package my.simple.dao.impl;

import my.simple.dao.interfaces.CrudDAO;
import my.simple.dao.utils.HibernateUtil;
import my.simple.domain.Entity;
import org.hibernate.Session;

public class CrudDAOImpl<Bean> implements CrudDAO {

    protected final Class typeParameterClass;


    public CrudDAOImpl(Class typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    @Override
    public void add(Entity object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
    }

    @Override
    public Entity getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Entity result = (Entity) session.get(typeParameterClass, id);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
        return result;
    }

    @Override
    public void update(Entity object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
    }

    @Override
    public void delete(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Bean del = (Bean) session.get(typeParameterClass, id);
        session.delete(del);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
    }
}
