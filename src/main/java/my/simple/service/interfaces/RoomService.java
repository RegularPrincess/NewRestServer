package my.simple.service.interfaces;

import my.simple.domain.RoomEntity;

/**
 * Created by jmfedorov on 03.04.17.
 */
public interface RoomService {
    RoomEntity getById(int id);
}
