package com.epam;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ///CoronaDisinfector disinfector = ObjectFactory.getInstance().createObject(CoronaDisinfector.class);
        ApplicationContext context = Application.run("com.epam", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDisinfector disinfector = context.getObject(CoronaDisinfector.class);
        disinfector.start(new Room());

    }
}
