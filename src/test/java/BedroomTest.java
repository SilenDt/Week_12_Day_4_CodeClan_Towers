import GuestPackage.Guest;
import RoomsPackage.Bedroom;
import RoomsPackage.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(1, RoomType.DOUBLE);
        guest = new Guest("Kyle MacLachlan");
    }

    //TESTS:
    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }
    @Test
    public void hasRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }
    @Test
    public void canAddGuestToRoom() {
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.numberOfGuestsInRoom());
    }
    @Test
    public void canRemoveGuestFromRoom() {
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest);
        bedroom.removeGuestFromRoom(guest);
        assertEquals(1, bedroom.numberOfGuestsInRoom());
    }
}
