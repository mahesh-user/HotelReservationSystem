package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;

public class HotelReservationSystem {
    List<Hotel> hotelsList = new LinkedList<>();
    public void addingHotelsToList(){
        Hotel hotel1 = new Hotel("LakeWood",3);
        Hotel hotel2 = new Hotel("BridgeWood",4);
        Hotel hotel3 = new Hotel("RidgeWood",5);
        try {
            hotelsList.add(hotel1);
            hotelsList.add(hotel2);
            hotelsList.add(hotel3);
            for (Hotel h:hotelsList){
                System.out.println("Hotel Name is "+h.hotelName+" and Hotel Rating is "+h.hotelRating);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
