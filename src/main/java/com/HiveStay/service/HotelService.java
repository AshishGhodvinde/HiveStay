package com.HiveStay.service;

import com.HiveStay.dto.HotelDto;
import com.HiveStay.dto.HotelInfoDto;
import com.HiveStay.entity.Hotel;
import org.jspecify.annotations.Nullable;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);
    HotelDto updateHotelById(Long id, HotelDto hotelDto);
    void deleteHotelById(Long id);
    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);
}
