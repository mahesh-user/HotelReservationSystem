package com.bridgelabz;

public class HotelReservationSystem {
    private String hotelName;
    private int weekdayRate;
    private int weekendRate;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRateForRegularCustomerOnWeekday() {
        return weekdayRate;
    }

    public void setRateForRegularCustomerOnWeekday(int weekdayRate) {
        this.weekdayRate = weekdayRate;
    }

    public int getRateForRegularCustomerOnWeekend() {
        return weekendRate;
    }

    public void setRateForRegularCustomerOnWeekend(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    @Override
    public String toString() {
        return "\n"+"Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRate=" + weekdayRate +'\''+
                ",weekendRate+"+ weekendRate +
                '}';
    }

    public HotelReservationSystem(String hotelName, int weekdayRate, int weekendRate) {
        this.hotelName = hotelName;
        this.weekdayRate = weekdayRate;
        this.weekendRate=weekendRate;
    }
}
