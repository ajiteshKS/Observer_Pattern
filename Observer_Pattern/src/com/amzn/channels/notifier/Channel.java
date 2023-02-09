package com.amzn.channels.notifier;

import com.amzn.observers.Observer;

public interface Channel {
    public Boolean add(Observer obv);
    public Boolean remove(Observer obv);
    public void notifySubs();
    public void setStock(int stocks);
}
