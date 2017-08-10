package com.mason;

import com.mason.publisher.VideoSite;
import com.mason.subscriber.VideoFans;

/**
 * Created by huang_sq on 2017/8/10.
 */
public class TestMain {

    public static void main(String[] args) {
        VideoSite videoSite = new VideoSite();
        VideoFans homeBoy = new VideoFans("One fat homeBoy");

        for (int i = 1; i<10;i++) {
            videoSite.registerSubscriber(homeBoy);
        }
        videoSite.notifyAllSubscriber();

    }
}
