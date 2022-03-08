package com.bridgelabz;
import java.util.ArrayList;
public class Hotel {
    ArrayList<HotelReservationSystem> hotelDetails=new ArrayList<>();

    public void  addHotel(String hotelName, int weekDayrate,int weekEndRate) {
       HotelReservationSystem hotelInformation= new HotelReservationSystem(hotelName, weekDayrate,weekEndRate);
        hotelDetails.add(hotelInformation);
    }
    public void displayHotel(){
        System.out.println(hotelDetails);
    }

    public boolean checkHotelAdd(HotelReservationSystem hotel) {
        return hotelDetails.add(hotel);
    }

    public int findingCheapestHotel(){
        int LakeWoodRate = 110; int BridgeWoodRate = 160; int Ridgewood = 220;
        int cheapestHotel = (LakeWoodRate>BridgeWoodRate) ?
                (Math.min(LakeWoodRate, Ridgewood)) :
                (Math.min(BridgeWoodRate,Ridgewood)) ;
        System.out.println("The cheapest Hotel prize is " +cheapestHotel);
        return cheapestHotel;
    }
}
