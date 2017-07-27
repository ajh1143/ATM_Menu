package com.company;

import java.util.Scanner;

public class Interface {
    //Create a new account object, set boolean, initiate the menu
    public Account user = new Account();
    public boolean menuStart;
    public void menu() {

     do {
         //Menu choices
         System.out.println("\nWelcome to the menu");
         System.out.println("\nPlease select an option.");
         System.out.println("1) Open an account");
         System.out.println("2) Check your balance");
         System.out.println("3) Make a deposit");
         System.out.println("4) Make a withdrawal");
         System.out.println("5) Account settings");
         Scanner scan = new Scanner(System.in);
         int selection = scan.nextInt();

         //Switch cases for menu interaction/functionality
         switch (selection) {
            //Create new customer account
             case 1:
                 System.out.println("Please enter your name.");
                 scan.nextLine();
                 String userName = scan.nextLine();
                 user.setName(userName.toString());
                 System.out.println("Welcome to our bank, " + user.getName());

                 System.out.println("Please enter your address.");
                 String address = scan.nextLine();
                 user.setAddress(address.toString());
                 System.out.println("Thank you.");

                 System.out.println("Please enter your first deposit amount.");
                 double startingBalance = scan.nextDouble();
                 user.setBalance(startingBalance);
                 System.out.println("Your current balance, is: " + user.getBalance());
                 break;
                 
             //Check customer's balance
             case 2:
                 System.out.println("Your balance is currently: " + user.getBalance());
                 break;

             //Make a deposit
             case 3:
                 System.out.println("Please enter an amount you'd like to deposit");
                 double deposit = scan.nextDouble();
                 user.setDeposit(deposit);
                 break;

             //Make a withdrawal
             case 4:
                 System.out.println("Please enter an amount you'd like to withdraw");
                 double withdraw = scan.nextDouble();
                 user.setWithdraw(withdraw);
                 break;

             //View and change account information(name, address)       
             case 5:
                 System.out.println("\nYour current account details are: \nName: " + user.getName() + "\nAddress: " +
                                                                                             user.getAddress());
                 System.out.println("\nPlease select the user information you want to change");
                 System.out.println("\nYour options are:");
                 System.out.println("Select '1' to change your name.");
                 System.out.println("Select '2' to change your address.");
                 int userChoice = scan.nextInt();
                 
                 //Change customer's account name
                 if (userChoice == 1){
                     scan.nextLine();
                     System.out.println("Please enter a new name.");
                     String newName = scan.nextLine();
                     user.setName(newName);

                 }
                 
                 //Change customer's address
                 if (userChoice == 2){
                     scan.nextLine();
                     System.out.println("Please enter a new address.");
                     String newAddress = scan.nextLine();
                     user.setAddress(newAddress.toString());
                 }

         }
         //Ask customer if they would like to continue
         System.out.println("Would you like to continue banking? Enter Yes or No");
         String stillBanking = scan.next();
         if (stillBanking.equalsIgnoreCase("yes")) {
             menuStart = true;
         } else if (stillBanking.equalsIgnoreCase("no")) {
             System.out.print("Thank you, your ending balance is: " + user.getBalance());
             menuStart = false;
         }
     }
     while (menuStart != false);
     }
}
