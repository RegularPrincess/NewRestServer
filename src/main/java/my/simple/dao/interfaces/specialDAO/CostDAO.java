package my.simple.dao.interfaces.specialDAO;

/**
 * Created by jmfedorov on 02.04.17.
 */
public interface CostDAO {
    //TODO: add to specialDao metods for pagination like this:
//    ArrayList<Entity> getFirstList();
//    ArrayList<Entity> getList(int number);

//    @Override
//    public ArrayList<Entity> getFirstList() {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        String hql = String.format("from %s", typeParameterClass.getCanonicalName());
//        Query SQLQuery = session.createQuery(hql);
//        ArrayList<Entity> result = (ArrayList<Entity>) SQLQuery.list();
//        session.getTransaction().commit();
//        if (session.isOpen()) {
//            session.close();
//        }
//        return result;
//    }
//
//    @Override
//    public ArrayList<Entity> getList(int number) {
//        return null;
//    }
}
