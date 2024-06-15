package org.example;

import java.lang.invoke.LambdaMetafactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class querypage {
static ResultSet resultSet;
   static PreparedStatement preparedStatement;
    public static void insert(encapsulation encapsulation) {
        String sql = "INSERT INTO bank (name, account_num, password, balance) VALUES (?, ?, ?, ?)";

        try (
                PreparedStatement preparedStatement = jdbc_connection.connection.prepareStatement(sql)) {
            preparedStatement.setString(1, encapsulation.getName());
            preparedStatement.setInt(2, encapsulation.getAccno());
            preparedStatement.setString(3, encapsulation.getPassword());
            preparedStatement.setString(4, encapsulation.getBalance());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Insert successful");
            } else {
                System.out.println("Insert failed");
            }

        } catch (SQLException e) {
            System.err.println("Error inserting data into database.");
            e.printStackTrace();
        }
    }
    public static boolean fatchprasionldetail(int accnum,String pass){
        try {
        String query = "SELECT * FROM bank WHERE account_num = ? AND password = ?";
        preparedStatement = jdbc_connection.connection.prepareStatement(query);
        preparedStatement.setInt(1, accnum);
        preparedStatement.setString(2, pass);

        // Execute the query
         resultSet = preparedStatement.executeQuery();
           if (resultSet.next()){
               System.out.println("you data is present");
               return true;
           }else {
               System.out.println("your data is not present try again");
return false;

           }

    } catch (SQLException e) {
        e.printStackTrace();
    }
        return false;
    }
    public static void depositdata(String newSalary,int accountnum,encapsulation encapsulation){
        String updateSQL = "UPDATE bank SET balance = ? WHERE account_num = ?";

        // Step 4: Create a PreparedStatement
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = jdbc_connection.connection.prepareStatement(updateSQL);
int newbal=Integer.valueOf(newSalary)+ Integer.valueOf(encapsulation.getBalance());
String newbalance=String.valueOf(newbal);
            // Step 5: Set the parameters
            preparedStatement.setString(1, newbalance);
            preparedStatement.setInt(2, accountnum);

            // Step 6: Execute the update
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

        }
        catch (Exception e){
            e.printStackTrace();
            }
        }
        public static void withdroe( encapsulation encapsulation,String udhari){

                String updateSQL = "UPDATE bank SET balance = ? WHERE account_num = ?";

                // Step 4: Create a PreparedStatement
                PreparedStatement preparedStatement = null;

                try {
                    preparedStatement = jdbc_connection.connection.prepareStatement(updateSQL);

                    int newbal=Integer.valueOf(encapsulation.getBalance())-Integer.valueOf(udhari) ;
                    if (newbal<Integer.valueOf(encapsulation.getBalance())&&newbal>0) {
                        String newbalance = String.valueOf(newbal);
                        preparedStatement.setString(1, newbalance);
                        preparedStatement.setInt(2, encapsulation.getAccno());
                        int rowsAffected = preparedStatement.executeUpdate();
                        System.out.println("Rows affected: " + rowsAffected);
                        System.out.println("pasa bank sa cut gaya");
                    }else {
                        System.out.println("it is not valid");
                }}
                catch (Exception e){
                    e.printStackTrace();
                }}

        }



