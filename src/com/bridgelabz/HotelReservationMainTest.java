package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationMainTest {
  Hotel hotelReservation = new Hotel();
    @Test
    public void ifHotelAdded_ShouldPassTest() {
        boolean lakewood = hotelReservation.checkHotelAdd(new HotelReservationSystem("LakeWoods",110,90));
        Assert.assertTrue(lakewood);
        boolean bridgewood =  hotelReservation.checkHotelAdd(new HotelReservationSystem("Bridgewood", 160,60));
        Assert.assertTrue(bridgewood);
        boolean ridgewood = hotelReservation.checkHotelAdd(new HotelReservationSystem("Ridgewood", 220,150));
        Assert.assertTrue(ridgewood);
    }
    @Test
    public void ifFindCheapestHotelShouldPass(){
        int cheap=160;
        int actual=Hotel.findingCheapestHotel();
        Assert.assertEquals(cheap, actual);
    }
}
