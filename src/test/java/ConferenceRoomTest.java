import Hotel.Guest;
import Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    ArrayList<Guest> guests;
    Guest guest;

    @Before
    public void setup(){
        guests = new ArrayList<>();
        conferenceRoom = new ConferenceRoom("Main Room", 500, 100, guests);
    }

    @Test
    public void hasName(){
        assertEquals("Main Room", conferenceRoom.getName());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(500, conferenceRoom.getDailyRate());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.guestCount());
    }


}
