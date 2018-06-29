package Room;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {
    int roomNumber;
    RoomType type;
    int nightlyRate;

    public Bedroom (int roomNumber, RoomType type, int nightlyRate, ArrayList<Guest> guests){
        super(type.getCapacity(), guests);
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.roomNumber = roomNumber;
    }



}
