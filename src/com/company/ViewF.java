package com.company;

import java.sql.*;

public class ViewF {
    public ViewF(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql:makylaperson");
            PreparedStatement query = connection.prepareStatement("SELECT name, airline, date0, time0, where0 FROM booking");
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
