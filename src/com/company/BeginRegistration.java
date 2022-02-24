package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BeginRegistration {
    public BeginRegistration(){
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Email: ");
        String email = in.nextLine();



        System.out.print("Phone Number: ");
        long phoneNum = in.nextLong();

        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql:makylaperson");

            PreparedStatement query = connection.prepareStatement("INSERT INTO person (name, email, phoneNum) VALUES (?, ?, ?)");

            query.setString(1, name);

            query.setString(2, email);

            query.setLong(3, phoneNum);

            query.executeQuery();


        }catch (SQLException ignored){
        }


    }

}
