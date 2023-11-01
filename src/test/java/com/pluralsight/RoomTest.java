package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoomTest {
    private Room room;

    @BeforeEach
    void setUp() {
        // Create an instance of Room before each test
        room = new Room(2, 100.0, false, false, true, false, false, false);
    }

    @Test
    public void testCheckedIn() {
        room.checkedIn();

        assertTrue(room.isRoomDirty());
        assertTrue(room.isRoomOccupied());
        assertFalse(room.isRoomAvailable());
    }

    @Test
    public void testIsCheckedOut() {
        room.isCheckedOut();

        assertFalse(room.isRoomDirty());
        assertFalse(room.isRoomOccupied());
        assertTrue(room.isRoomAvailable());
    }

    @Test
    public void testCleanRoom() {
        room.cleanRoom();

        assertFalse(room.isRoomDirty());
    }

    @Test
    public void testGetNumberOfBeds() {
        int numberOfBeds = room.getNumberOfBeds();

        assertEquals(2, numberOfBeds);
    }

    @Test
    public void testGetRoomPrice() {
        double roomPrice = room.getRoomPrice();

        assertEquals(100.0, roomPrice, 0.01);
    }

    @Test
    public void testIsRoomOccupied() {
        boolean isRoomOccupied = room.isRoomOccupied();

        assertFalse(isRoomOccupied);
    }

    @Test
    public void testIsRoomDirty() {
        boolean isRoomDirty = room.isRoomDirty();

        assertFalse(isRoomDirty);
    }

    @Test
    public void testIsRoomAvailable() {
        boolean isRoomAvailable = room.isRoomAvailable();

        assertTrue(isRoomAvailable);
    }
}
