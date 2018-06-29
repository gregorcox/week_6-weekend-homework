package Room;

import Hotel.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    String name;
    int dailyRate;

    public ConferenceRoom(String name, int dailyRate, int capacity, ArrayList<Guest> guests){
        super(capacity, guests);
        this.name = name;
        this.dailyRate = dailyRate;

    }

    public String getName(){
        return name;
    }

    public int getDailyRate(){
        return dailyRate;
    }
}
