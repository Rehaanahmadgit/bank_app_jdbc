package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class frameing {

    public void bankinfo() throws SQLException {
        Scanner scan = new Scanner(System.in);
boolean t=true;
        while (t) {
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" ***Banking System Application***");
            System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" 1. Create a new account");
            System.out.println(" 2. Check Balance");
            System.out.println(" 3. Deposit the amount");
            System.out.println(" 4. Withdraw the amount");
            System.out.println(" 5. Exit");
            System.out.print("\n ENTER YOUR CHOICE :: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    proces process = new proces();
                    process.newaccount();
                    break;
                case 2:
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    proces poce=new proces();
                    poce.checkbal();
                         break;
                case 3:
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("---------WELCOME TO DEPOSITE PAGE---------------- ");
                proces proces=new proces();
                    proces.deposit();
                System.out.println();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");

                break;
                case 4:
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("---------WELCOME TO DEPOSITE PAGE---------------- ");
                    proces proces1=new proces();
                    proces1.withdraw();
                    System.out.println();
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    break;
                case 5:

                    System.out.println("\n Thank you for using our Banking System!");
                    t=false;
                    return;
                default:
                    System.out.println("\n Invalid choice! Please enter a valid option.");
            }
        }
    }
}


