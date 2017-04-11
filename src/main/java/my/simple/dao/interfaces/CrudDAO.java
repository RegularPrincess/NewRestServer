package my.simple.dao.interfaces;

import java.util.Objects;

/**
 * Created by jmfedorov on 03.04.17.
 */
public interface CrudDAO {
    void add(Object object, Class typeParameterClass);
    Object getById(int id, Class typeParameterClass);
    void update(Object object);
    void delete(int id, Class typeParameterClass);

}
