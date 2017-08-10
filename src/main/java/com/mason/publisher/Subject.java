package com.mason.publisher;

import com.mason.subscriber.Subscriber;

/**
 * Created by huang_sq on 2017/8/10.
 * subject相当于publisher
 */
public interface Subject {

    void registerSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifyAllSubscriber();


}
