package com.pluralsight.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My nifty timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
