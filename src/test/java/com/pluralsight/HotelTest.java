package com.pluralsight;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HotelTest {
    private Hotel hotel;

    @BeforeEach
    void setUp() {
        // Create an instance of Hotel before each test
        hotel = new Hotel("Sample Hotel", 10, 20);
    }

    @Test
    public void testGetName() {
        String name = hotel.getName();
        assertEquals("Sample Hotel", name);
    }

    @Test
    public void testGetNumberOfSuites() {
        int numberOfSuites = hotel.getNumberOfSuites();
        assertEquals(10, numberOfSuites);
    }

    @Test
    public void testGetNumberOfRooms() {
        int numberOfRooms = hotel.getNumberOfRooms();
        assertEquals(20, numberOfRooms);
    }

    @Test
    public void testGetBookedSuites() {
        int bookedSuites = hotel.getBookedSuites();
        assertEquals(0, bookedSuites); // Assuming none booked initially
    }

    @Test
    public void testGetBookedRooms() {
        int bookedRooms = hotel.getBookedRooms();
        assertEquals(0, bookedRooms); // Assuming none booked initially
    }

    @Test
    public void testIsSuite() {
        boolean isSuite = hotel.isSuite();
        assertFalse(isSuite);
    }

    @Test
    public void testGetAvailableSuites() {
        int availableSuites = hotel.getAvailableSuites();
        assertEquals(10, availableSuites); // All suites are initially available
    }

    @Test
    public void testGetAvailableRooms() {
        int availableRooms = hotel.getAvailableRooms();
        assertEquals(20, availableRooms); // All rooms are initially available
    }

    @Test
    public void testBookRoom() {
        boolean bookingResult = hotel.bookRoom(5, false, 15);
        assertTrue(bookingResult); // Booking should be successful

        // Verify that the available rooms have decreased
        assertEquals(10, hotel.getAvailableSuites());
        assertEquals(15, hotel.getAvailableRooms());
    }
}
