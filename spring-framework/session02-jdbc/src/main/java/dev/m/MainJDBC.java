package dev.m;

import java.sql.*;

public class MainJDBC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "123456";
        String query = "select * from orm_jpa";
        try {
            Connection c = DriverManager.getConnection(url, username, password);
            PreparedStatement st = c.prepareStatement(query); // quan ly cau sql
            // Execute the query
            ResultSet count = st.executeQuery();// thuc thi cau sql  --> ResultSet
            while (count.next()) {
                String filePath = count.getString("name");
                System.out.println(filePath);
                System.out.println("Number of rows affected by this query: " + count);
            }
            // Close the connection
            st.close();
            c.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.err.println("SQL Error: "
                    + e.getMessage());
        }
    }
}
