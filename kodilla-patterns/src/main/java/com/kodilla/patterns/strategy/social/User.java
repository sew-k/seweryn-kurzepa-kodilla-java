package com.kodilla.patterns.strategy.social;

public sealed class User
    permits Millenials, ZGeneration, YGeneration {
    private String name;
    protected SocialPublisher socialPublisher;

    public User(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public String sharePost(String text) {
        String result = "Post: " + text + ", share in: " + socialPublisher.share();
        System.out.println(result);
        return result;
    }
}
