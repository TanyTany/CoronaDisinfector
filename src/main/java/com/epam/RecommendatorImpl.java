package com.epam;

public class RecommendatorImpl implements Recommendator {
    @InjectProperty("wisky")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from Covid-2019, drink "+alcohol);
    }
}
