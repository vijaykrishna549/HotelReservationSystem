package com.bridgelabz.test;

import java.util.ArrayList;
import java.util.List;

class AddHotel{
    String HotelName;
    int HotelRating;
    int WeekRate_for_Regular_Customers;
    int Week_Rate_for_Reward_Customers;
    int Weekend_Rate_for_Regular_Customers;
    int Weekend_Rate_for_Reward_customers;

    public AddHotel(String HotelName,int HotelRating ,int WeekRate_for_Regular_Customers,
                    int Week_Rate_for_Reward_Customers,int Weekend_Rate_for_Regular_Customers,
                    int Weekend_Rate_for_Reward_customers){
        this.HotelName = HotelName;
        this.HotelRating = HotelRating;
        this.Week_Rate_for_Reward_Customers = Week_Rate_for_Reward_Customers;
        this.WeekRate_for_Regular_Customers = WeekRate_for_Regular_Customers;
        this.Weekend_Rate_for_Regular_Customers = Weekend_Rate_for_Regular_Customers;
        this.Weekend_Rate_for_Reward_customers = Weekend_Rate_for_Reward_customers;
    }

}

public class HotelReservationSystem {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

        List<AddHotel> holtelList = new ArrayList<>();
        holtelList.add(new AddHotel("Lakewood",3,110,
                80,90,80));
        holtelList.add(new AddHotel("BridgeWood", 4, 160,
                110,
                60,50));
        holtelList.add(new AddHotel("RidgeWood",5,220,
                100,150,
                150));


    }
}
