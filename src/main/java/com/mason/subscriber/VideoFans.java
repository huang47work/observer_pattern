package com.mason.subscriber;

import com.mason.publisher.Subject;

/**
 * Created by huang_sq on 2017/8/10.
 */
public class VideoFans implements Subscriber {

    private String name;

    public VideoFans(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + "xxx tokyo hot is now available!");
    }
}
