import Hotel.Guest;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    ArrayList<Guest> guests;

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
}
