import Hotel.Guest;
import Hotel.Hotel;
import Room.Bedroom;
import Room.ConferenceRoom;
import Room.DiningRoom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    ArrayList<Guest> guests;
    ArrayList<Bedroom> bedrooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<ConferenceRoom> conferenceRooms;


    @Before
    public void setUp(){
        guests = new ArrayList<>();
        bedroom = new Bedroom(1, RoomType.DOUBLE, 50, guests);
        conferenceRoom = new ConferenceRoom("Conference", 100, 200, guests);
        guest = new Guest("John");
        hotel = new Hotel("CodeClan Towers", bedrooms, diningRooms, conferenceRooms);
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.checkInGuest(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.guestCount());

    }

}
