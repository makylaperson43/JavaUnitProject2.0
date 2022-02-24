package com.company;

import java.sql.*;
import java.util.Scanner;

public class Flight {
    public void create(){
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("What airline would you like to fly on? ");
        String airline = in.nextLine();

        System.out.print("Date: ");
        String date0 = in.nextLine();

        System.out.print("Time: ");
        String time0 = in.nextLine();

        System.out.print("Where: ");
        String where0 = in.nextLine();

        System.out.print("How many tickets: ");
        int tickets = in.nextInt();

        int totalTickets = tickets * 100;
        System.out.println(String.format("Your total is: %s", totalTickets));


        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql:makylaperson");
            PreparedStatement query = connection.prepareStatement("INSERT INTO booking(name, airline, date0, time0, where0, tickets, total) VALUES (?, ?, ?, ?, ?, ?, ?)");
            query.setString(1, name);
            query.setString(2, airline);
            query.setString(3, date0);
            query.setString(4, time0);
            query.setString(5, where0);
            query.setInt(6, tickets);
            query.setInt(7, totalTickets);
            query.executeQuery();

        }catch (SQLException ignored){
        }
    }



}
