import Hotel.Guest;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    ArrayList<Guest> guests;
    Guest guest;

    @Before
    public void setup(){
        guests = new ArrayList<>();
        diningRoom = new DiningRoom("The Dining Room", 12, guests);
    }

    @Test
    public void hasName(){
        assertEquals("The Dining Room", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(12, diningRoom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom.addGuest(guest);
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.guestCount());
    }
}
