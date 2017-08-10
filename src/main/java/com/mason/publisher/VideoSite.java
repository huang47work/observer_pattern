package com.mason.publisher;

import com.mason.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by huang_sq on 2017/8/10.
 *
 */
public class VideoSite implements Subject {

    private static List<Subscriber> userList;
    private static List<String> videos;

    public VideoSite() {
        userList = new ArrayList<>(100);
        videos = new ArrayList<>(100);
    }


    public void registerSubscriber(Subscriber subscriber) {
        if (userList.size() < 100) {
            userList.add(subscriber);
        }
    }

    public void removeSubscriber(Subscriber subscriber) {
        Iterator iterator = userList.iterator();
        while (iterator.hasNext()) {
            Subscriber temp = (Subscriber) iterator.next();
            if (Objects.equals(subscriber, temp)) {
                iterator.remove();
            }
        }
    }

    public void notifyAllSubscriber() {
        for (Subscriber temp : userList) {
            temp.update(this);
        }
    }
}
