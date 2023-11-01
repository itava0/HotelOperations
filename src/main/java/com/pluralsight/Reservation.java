package com.pluralsight;

public class Reservation {
    private String roomType;
    private double reservationPrice;
    private int numberNights;
    private boolean weekendRes;
    private double reservationTotalPrice;

    public Reservation(String roomType, double reservationPrice, int numberNights, boolean weekendRes, double reservationTotalPrice) {
        this.roomType = roomType;
        this.reservationPrice = reservationPrice;
        this.numberNights = numberNights;
        this.weekendRes = weekendRes;
        this.reservationTotalPrice = reservationTotalPrice;
    }

    public String getRoomType() {
        return roomType;
    }

    public double setRoomType(String roomType) {
        if (roomType.equalsIgnoreCase("king")) {
            return reservationPrice = 139.00;
        } else {
            return reservationPrice = 124.00;
        }
    }

    public double getReservationPrice() {
        return reservationPrice * numberNights;
    }

    public void setReservationPrice(double reservationPrice) {
        this.reservationPrice = reservationPrice;
    }

    public int getNumberNights() {
        return numberNights;
    }

    public void setNumberNights(int numberNights) {
        this.numberNights = numberNights;
    }

    public boolean isWeekendRes() {
        return weekendRes;
    }

    public void setWeekendRes(boolean weekendRes) {
        this.weekendRes = weekendRes;
    }

    public double getReservationTotalPrice() {
        if (isWeekendRes()) {
            return reservationPrice * .10;
        } else {
            return reservationPrice;
        }
    }

    public void setReservationTotalPrice(double reservationTotalPrice) {
        this.reservationTotalPrice = reservationTotalPrice;
    }
}