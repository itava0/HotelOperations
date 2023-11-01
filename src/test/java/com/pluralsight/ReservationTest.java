package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservationTest {
    private Reservation reservation;

    @BeforeEach
    void setUp() {
        // Create an instance of Reservation before each test
        reservation = new Reservation("king", 139.0, 2, true, 0.0);
    }

    @Test
    public void testSetRoomType() {
        double newPrice = reservation.setRoomType("queen");
        assertEquals(124.0, newPrice, 0.01); // Assuming queen room type
    }

    @Test
    public void testGetReservationPrice() {
        double totalPrice = reservation.getReservationPrice();
        assertEquals(139.0 * 2, totalPrice, 0.01); // Assuming $139.0 per night and 2 nights
    }

    @Test
    public void testGetReservationTotalPrice() {
        double totalPrice = reservation.getReservationTotalPrice();
        assertEquals(139.0 * 2, totalPrice, 0.01); // Assuming $139.0 per night and 2 nights, and it's not a weekend reservation
    }

    @Test
    public void testGetReservationTotalPriceWeekend() {
        reservation.setWeekendRes(true);
        double totalPrice = reservation.getReservationTotalPrice();
        assertEquals(139.0 * 2 * 1.10, totalPrice, 0.01); // Assuming $139.0 per night, 2 nights, and a weekend reservation
    }

    @Test
    public void testIsWeekendRes() {
        boolean isWeekendRes = reservation.isWeekendRes();
        assertTrue(isWeekendRes);
    }

    @Test
    public void testSetWeekendRes() {
        reservation.setWeekendRes(false);
        assertFalse(reservation.isWeekendRes());
    }
}
