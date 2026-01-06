package com.HiveStay.service;

import com.HiveStay.dto.HotelDto;
import com.HiveStay.dto.HotelSearchRequest;
import com.HiveStay.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);
    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
