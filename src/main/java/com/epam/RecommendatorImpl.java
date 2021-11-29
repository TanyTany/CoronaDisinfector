package com.epam;

@Singletone
@Deprecated
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("wisky")
    private String alcohol;

    public RecommendatorImpl() {
        System.out.println("Recommendator was created");
    }

    @Override
    public void recommend() {
        System.out.println("to protect from Covid-2019, drink "+alcohol);
    }
}
