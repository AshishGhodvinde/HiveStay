package com.HiveStay.service;

import com.HiveStay.dto.BookingDto;
import com.HiveStay.dto.BookingRequest;
import com.HiveStay.dto.GuestDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);
    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
