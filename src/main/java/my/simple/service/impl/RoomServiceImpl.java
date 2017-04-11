package my.simple.service.impl;

import my.simple.dao.interfaces.CrudDAO;
import my.simple.dao.interfaces.specialDAO.RoomDAO;
import my.simple.domain.RoomEntity;
import my.simple.service.interfaces.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jmfedorov on 11.04.17.
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private CrudDAO crudDAO;

    @Override
    public RoomEntity getById(int id) {
        return (RoomEntity) crudDAO.getById(id, RoomEntity.class);
    }
}
