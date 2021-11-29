package com.epam;

public class CoronaDisinfector {

    @InjectByType
    private Annauncer announcer;
    @InjectByType
    private Policeman policeman;

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
