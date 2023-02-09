package com.amzn.channels.notifier;

import com.amzn.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ChannelImpl implements Channel{
    final int MAX_OBSERVERS = 100;

    public int getStocksAvailable() {
        return stocksAvailable;
    }

    int stocksAvailable;
    List<Observer> observers = new ArrayList();

    @Override
    public Boolean add(Observer obv) {
        if(observers.size() >= MAX_OBSERVERS)
            return false;

        observers.add((obv));
        return true;
    }

    @Override
    public Boolean remove(Observer obv) {
        if(observers.isEmpty())
            return false;

        observers.remove(obv);
        return true;
    }

    @Override
    public void notifySubs() {
        for(Observer observer :observers)
        {
            observer.updateMsg(getStocksAvailable());
        }
    }

    @Override
    public void setStock(int stocks) {
        stocksAvailable = stocks;
    }
}
