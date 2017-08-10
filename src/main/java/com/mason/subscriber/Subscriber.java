package com.mason.subscriber;

import com.mason.publisher.Subject;

/**
 * Created by huang_sq on 2017/8/10.
 * 订阅者 相当于Observer
 */
public interface Subscriber {

    void update(Subject subject);

}
