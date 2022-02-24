package com.company;

import java.sql.*;

public class View {
    public View(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql:makylaperson");
            PreparedStatement query = connection.prepareStatement("SELECT name, email, phoneNum FROM person");
            ResultSet rs = query.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue);
                }
                System.out.println("");
            }
        } catch (SQLException ignored) {
        }
    }
}
