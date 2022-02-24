package com.company;
import java.sql.*;
import java.util.Scanner;

public class Delete {
    public Delete(){
        Scanner myObj = new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql:makylaperson");
            System.out.println("Please insert the name you want to delete.");
            String name = myObj.nextLine();
            PreparedStatement cancel = connection.prepareStatement( "DELETE FROM booking WHERE name = ?");
            cancel.setString(1, name);
            System.out.println(String.format("You have canceled the flight for %s", name));
            cancel.executeQuery();
        }catch (SQLException ignored) {
        }
    }

}
