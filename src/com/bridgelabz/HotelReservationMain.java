package com.bridgelabz;

public class HotelReservationMain {
    public static void main(String[] args) {
       Hotel hotel = new Hotel();
        hotel.addHotel("LakeWood",110,90);
        hotel.addHotel("BridgeWood",160,60);
        hotel.addHotel("RidgeWood", 220,150);
        hotel.displayHotel();
        hotel.findingCheapestHotel();
    }
}
