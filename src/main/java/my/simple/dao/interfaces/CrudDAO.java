package my.simple.dao.interfaces;

import my.simple.domain.Entity;

import java.util.ArrayList;

/**
 * Created by jmfedorov on 03.04.17.
 */
public interface CrudDAO {
    void add(Entity object);
    Entity getById(int id);
    void update(Entity object);
    void delete(int id);

}
