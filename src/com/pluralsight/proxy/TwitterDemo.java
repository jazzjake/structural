package com.pluralsight.proxy;

public class TwitterDemo {

    public static void main(String[] args) {
        //TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("jazzjake517273"));

        service.postToTimeline("jazzjake517273", "Some message that shouldn't go through.");
    }
}
