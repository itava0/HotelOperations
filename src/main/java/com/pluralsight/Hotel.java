package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;
    private boolean isSuite;
    public int availableSuites;
    public int availableRooms;
    public Hotel(String name, int numberOfSuites, int numberOfRooms){}
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms){}

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public boolean isSuite() {
        return isSuite;
    }
    public int getAvailableSuites() {
        return availableSuites;
    }
    public int getAvailableRooms() {
        return availableRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite, int availableRooms){
        return numberOfRooms > 0 && isSuite && availableRooms > 0;
    }
}