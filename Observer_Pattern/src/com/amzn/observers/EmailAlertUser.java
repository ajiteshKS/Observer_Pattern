package com.amzn.observers;

public class EmailAlertUser implements Observer{

        String userName;
        String email;

        public EmailAlertUser(String name, String email)
        {
            userName = name;
            this.email = email;
        }

        @Override
        public void updateMsg(int stocksAvailable) {
            if(stocksAvailable == 0)
            {
                System.out.println("Out of Stock Currently");
            }
            else
            {
                System.out.println("Hi " + email +", there are "+ stocksAvailable+ " currently.");
            }
        }
    }
