package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class proces {
 static    Scanner sc = new Scanner(System.in);
    public void newaccount() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account No: ");
            int acc = sc.nextInt();
            System.out.print("Enter Password: ");
            String pass = sc.next();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Balance: ");
            String bal = sc.next();

            encapsulation encapsulation = new encapsulation(acc, name, pass, bal);
            querypage.insert(encapsulation);

        } catch (Exception e) {
            System.err.println("Error creating new account.");
            e.printStackTrace();
        }
    }
    public void checkbal()  {
        System.out.println("enter the account num");
        int accnum=sc.nextInt();
        System.out.println("enter the password");
        String pass=sc.next();
        boolean ans=querypage.fatchprasionldetail(accnum,pass);
        try {
            while (ans) {
           String accountHolderName   = querypage.resultSet.getString("name");
          int  accountId  = querypage.resultSet.getInt("account_num");
          String  bal   =querypage.resultSet.getString("balance");
            System.out.println("Account ID: " + accountId + ", Account Holder: " + accountHolderName+" ,balance:"+bal);
            break;
        }}catch (SQLException e) {
           e.printStackTrace();
        }


    }
    public void deposit() throws SQLException {
        System.out.println("enter the account num");
        int accnum = sc.nextInt();
        System.out.println("enter the password");
        String pass = sc.next();
        boolean ch = querypage.fatchprasionldetail(accnum, pass);

        if (ch) {

            encapsulation encapsulation = new encapsulation(accnum, querypage.resultSet.getString("name"), pass, querypage.resultSet.getString("balance"));

            System.out.println("enter the ammount value");
            String ammount = sc.next();
            try {
                querypage.depositdata(ammount,accnum,encapsulation);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("your data is wronged");
        }
    }
        public void withdraw() throws SQLException {
        System.out.println("enter the account num");
        int accnum = sc.nextInt();
        System.out.println("enter the password");
        String pass = sc.next();
        boolean ch = querypage.fatchprasionldetail(accnum, pass);

if (ch){
        System.out.println("Enter the Amount you want to withdraw:");
        Scanner sc= new Scanner(System.in);
        String withdraw =sc.next();

            encapsulation encapsulation=new encapsulation(accnum,querypage.resultSet.getString("name"),pass,querypage.resultSet.getString("balance"));
    System.out.println(" "+ withdraw+" is withdrawn from your Account");
    querypage.withdroe(encapsulation,withdraw);



    }

    }
}




