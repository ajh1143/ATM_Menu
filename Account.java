package com.company;

public class Account {
        private String userName;
        private String address;
        private double balance;
        private double deposit;
        private double withdraw;

        //Sets the username
        void setName(String _userName)
        {
            userName = _userName;
        }
        //Sets initial deposit amount
        void setDeposit(double _amount){
            balance += _amount;
        }
        //Sets withdrawal amount
        void setWithdraw(double _amount){
            balance -= _amount;
        }
        //Sets user's address
        void setAddress(String _address)
        {
            address = _address;
        }
        
        void setBalance(double amount)
        {
            balance += amount;
        }
        //Returns the customer's username
        String getName()
        {
            return userName;
        }
        //Returns the customer's address
        String getAddress()
        {
            return address;
        }
        //Returns the customer's balance
        double getBalance()
        {
            return balance;
        }

}

