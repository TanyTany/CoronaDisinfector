package com.epam;

public class CoronaDisinfector {

    private Annauncer announcer = ObjectFactory.getInstance().createObject(Annauncer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room) {
        announcer.announce("Start Disinfection! Leave the room!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Can go back");
    }

    private void disinfect(Room room) {
        System.out.println("Disinfection completed");
    }
}
