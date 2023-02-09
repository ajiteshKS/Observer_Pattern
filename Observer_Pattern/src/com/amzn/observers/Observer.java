package com.amzn.observers;

import com.amzn.channels.notifier.Channel;

public interface Observer {
    public void updateMsg(int stocksAvailable);
}
