package com.meteor.demo.pattern.observer.test.definite;

import java.util.Date;

/**
 * Created  meteor on 2020/11/9
 **/
public class WatchingTVListener  {

    public WatchingTVListener () {
        System.out.println("watching TV");
    }

    public void stopWatchingTV(Date date) {
        System.out.println("stop watching" + date);
    }

}
