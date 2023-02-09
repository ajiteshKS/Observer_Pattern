package com.amzn.observers;

public class MobileAlertUser implements Observer{
    String userName;
    long cellNumber;

    public MobileAlertUser(String name, long number)
    {
        userName = name;
        cellNumber = number;
    }

    @Override
    public void updateMsg(int stocksAvailable) {
        if(stocksAvailable == 0)
        {
            System.out.println("Out of Stock Currently");
        }
        else
        {
            System.out.println("Hi " + cellNumber +", there are "+ stocksAvailable+ " currently.");
        }
    }
}
