package com.company;

public class Account {
        private String userName;
        private String address;
        private double balance;
        private double deposit;
        private double withdraw;

        void setName(String _userName)
        {
            userName = _userName;
        }

        void setDeposit(double _amount){
            balance += _amount;
        }

        void setWithdraw(double _amount){
            balance -= _amount;
        }

        void setAddress(String _address)
        {
            address = _address;
        }
        void setBalance(double amount)
        {
            balance += amount;
        }
        String getName()
        {
            return userName;
        }

        String getAddress()
        {
            return address;
        }
        double getBalance()
        {
            return balance;
        }

}

