package com.amzn.factory.observers;

import com.amzn.observers.EmailAlertUser;
import com.amzn.observers.MobileAlertUser;
import com.amzn.observers.Observer;

public class ObserverFactory {
    public Observer getObserver(User userType, String email, Long cellNum)
    {
        switch(userType)
        {
            case EMAILUSER : return new EmailAlertUser(email, email);
            case MOBILEUSER: return new MobileAlertUser(email, cellNum);
        }
        return null;
    }
}
