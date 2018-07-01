package Room;

import Hotel.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {
    String name;

    public DiningRoom(String name, int capacity, ArrayList<Guest> guests){
        super(capacity, guests);
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
