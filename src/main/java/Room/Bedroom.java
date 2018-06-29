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


    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType(){
        return type;
    }

    public int capacity(){
        return this.type.getCapacity();
    }

    public int getNightlyRate() {
        return nightlyRate;
    }
}
