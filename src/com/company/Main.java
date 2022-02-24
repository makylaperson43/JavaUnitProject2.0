package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Flight a = new Flight();
        System.out.println("FlyMeOut");
        System.out.println("Do you want to book a flight with BigKy'sAirline ");
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Get [start]ed, [book] flight, [view] people who booked ,[viewF] flights, [cancel] flight.");
            String newL = in.nextLine();
            if(newL.equals("start")){
                BeginRegistration n = new BeginRegistration();
            }else if(newL.equals("book")){
                a.create();
            }else if(newL.equals("view")){
                new View();
            }else if(newL.equals("viewF")){
                new ViewF();
            }else if(newL.equals("cancel")){
                new Delete();
            }

        }
            }
        }





//        else if(newL.equals("pay")){
//                System.out.println("Who are you paying for");
//                String payInput = in.nextLine();
////                if payInput = System.out.print("Enter How Much You Would Like To Pay: ");
//                int payment = in.nextInt();
//                int total =  payment;
//                System.out.println("Total :"+ total);
//                }


