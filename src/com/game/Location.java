package com.game;

import java.util.HashMap;
import java.util.List;

public class Location {
    public String name;
    public String roomDescription;
    public String question;
    List<String> availableExits;
    List<String> roomItems;
    HashMap<String, String> exitsTo;
    HashMap<String, String> actionDescription;

    public Location(String name, String roomDescription, String question, List<String> availableExits,
                    List<String> roomItems, HashMap<String, String> exitsTo, HashMap<String, String> actionDescription ){
        this.name = name;
        this.roomDescription = roomDescription;
        this.question = question;
        this.availableExits = availableExits;
        this.roomItems = roomItems;
        this.exitsTo = exitsTo;
        this.actionDescription = actionDescription;
    }

}
