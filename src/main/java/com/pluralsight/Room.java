package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double roomPrice;
    private boolean roomOccupied;
    private boolean roomDirty;
    private boolean roomAvailable;
    private boolean checkedIn;
    private boolean checkedOut;
    private boolean cleanRoom;

    public Room(int numberOfBeds, double roomPrice, boolean roomOccupied, boolean roomDirty, boolean roomAvailable,boolean checkedIn,boolean checkedOut,boolean cleanRoom) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.roomOccupied = roomOccupied;
        this.roomDirty = roomDirty;
        this.roomAvailable = roomAvailable;
        this.checkedIn = checkedIn;
        this.checkedOut = checkedOut;
        this.cleanRoom = cleanRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public void checkedIn(){
        roomDirty = true;
        roomOccupied = true;
        roomAvailable = false;
    }
    public void isCheckedOut(){
        if(!roomDirty){
            roomDirty = false;
            roomOccupied = false;
        }
        else{
            cleanRoom();
            isCheckedOut();
        }
        roomAvailable = true;
    }

    public void cleanRoom() {
        roomDirty = false;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean isRoomOccupied() {
        return roomOccupied;
    }

    public boolean isRoomDirty() {
        return roomDirty;
    }

    public boolean isRoomAvailable() {
        return roomAvailable;
    }

}