package com.bridgelabz;

public class HotelReservationSystem {
    private String hotelName;
    private int weekdayRate;
    private int weekendRate;

    public HotelReservationSystem(String hotelName, int weekdayRate, int weekendRate) {
        this.hotelName = hotelName;
        this.weekdayRate = weekdayRate;
        this.weekendRate=weekendRate;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public int getWeekdayRate() {
        return weekdayRate;
    }
    public void setWeekdayRate(int weekdayRate) {
        this.weekdayRate = weekdayRate;
    }
    public int getWeekendRate() {
        return weekendRate;
    }
    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    public String toString() {
        return "\n"+"Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRating=" +weekdayRate +'\''+
                ", weekEndRating=" +weekendRate +'\''+
                '}';
    }
}
