package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationMainTest {
    @Test
    public void whenHotelAdded_ShouldPassTest_IfAddedToList() {
        Hotel hotelReservation = new Hotel();

        boolean hotelLakewoodAdded = hotelReservation.checkHotelAdd(new HotelReservationSystem("LakeWoods", 110,90));
        Assert.assertTrue(hotelLakewoodAdded);
        boolean hotelBridgewoodAdded = hotelReservation.checkHotelAdd(new HotelReservationSystem("Bridgewood", 160,60));
        Assert.assertTrue(hotelBridgewoodAdded);
        boolean hotelRidgewoodAdded = hotelReservation.checkHotelAdd(new HotelReservationSystem("Ridgewood", 220,150));
        Assert.assertTrue(hotelRidgewoodAdded);
    }

    @Test
    public void toFindTheCheapestHotel() {
        Hotel cheapHotel = new Hotel();
        cheapHotel.findCheapestHotel();
    }

    @Test
    public void toFindTheCheapestHotel_OnWeekdayAndWeekend() {
        Hotel cheapHotel = new Hotel();
        cheapHotel.findCheapestHotel_Weekday_Weekend();
    }
}
