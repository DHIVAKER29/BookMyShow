package com.scaler.bookmyshow.dtos;

import com.scaler.bookmyshow.models.Booking;
import com.scaler.bookmyshow.models.BookingStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDto {
    private Booking booking;
    private BookingStatus bookingStatus;
}