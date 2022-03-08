package com.bridgelabz;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationMain {

    public static void main(String[] args) throws ParseException {

        Hotel hotelReservation = new Hotel();

        hotelReservation.addHotel("LakeWood", 110,90);
        hotelReservation.addHotel("BridgeWood", 150,60);
        hotelReservation.addHotel("RidgeWood", 220,150);

        String sDate1="10-09-2020";
        String sDate2="11-09-2020";
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);

        hotelReservation.getHotelDetails();
        hotelReservation.findCheapestHotel();
        hotelReservation.findCheapestHotel_Weekday_Weekend();
    }
}



