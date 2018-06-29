import Hotel.Guest;
import Room.Bedroom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    ArrayList<Guest> guests;

    @Before
    public void setup(){
        guests = new ArrayList<>();
        bedroom = new Bedroom(1, RoomType.DOUBLE, 50, guests);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(50, bedroom.getNightlyRate());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, bedroom.guestCount());
    }




}
