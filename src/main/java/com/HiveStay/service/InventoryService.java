package com.HiveStay.service;

import com.HiveStay.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);
    void deleteFutureInventories(Room room);

}
