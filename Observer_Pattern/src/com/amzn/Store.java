package com.amzn;

import com.amzn.channels.notifier.Channel;
import com.amzn.channels.notifier.ChannelImpl;
import com.amzn.factory.observers.ObserverFactory;
import com.amzn.factory.observers.User;
import com.amzn.observers.Observer;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        ObserverFactory factory = new ObserverFactory();
        Observer mobileUser1 = factory.getObserver(User.MOBILEUSER, "aman3a@gmail.com",999900858884L);
        Observer mobileUser2 = factory.getObserver(User.MOBILEUSER, "aks22@yahoo.com", 87654904213L);
        Observer emailUser1 = factory.getObserver(User.EMAILUSER, "bbb@gmail.com", 987653241L);
        Observer emailUser2 = factory.getObserver(User.EMAILUSER, "ccbdgds@uc.com", 9877655359L);


        Channel channel = new ChannelImpl();
        channel.add(mobileUser1);
        channel.add(mobileUser2);
        channel.add(emailUser1);
        channel.add(emailUser2);

        channel.notifySubs();
        channel.setStock(19);

        channel.notifySubs();
        channel.setStock(0);

        channel.notifySubs();
        channel.setStock(1);
        channel.notifySubs();

    }
}
