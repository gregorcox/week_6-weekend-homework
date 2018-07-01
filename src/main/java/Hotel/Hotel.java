package Hotel;

import Room.Bedroom;
import Room.ConferenceRoom;
import Room.DiningRoom;
import Room.Room;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Bedroom> bedrooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    private String name;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<DiningRoom> diningRooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public void checkInGuest(Room room, Guest guest){
        if (!room.checkIfFull()){
            room.addGuest(guest);
        }
    }

}
