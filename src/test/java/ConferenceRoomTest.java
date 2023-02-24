import GuestPackage.Guest;
import RoomsPackage.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    //Instance Variables:
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Red Room", 50);
        guest = new Guest("Kyle MacLachlan");
    }

    @Test
    public void hasName() {
        assertEquals("Red Room", conferenceRoom.getRoomName());
    }
    @Test
    public void hasCapacity() {
        assertEquals(50, conferenceRoom.getCapacity());
    }
    @Test
    public void canAddGuestToRoom() {
        conferenceRoom.addGuestToRoom(guest);
        assertEquals(1, conferenceRoom.numberOfGuestsInRoom());
    }
    @Test
    public void canRemoveGuestFromRoom() {
        conferenceRoom.addGuestToRoom(guest);
        conferenceRoom.addGuestToRoom(guest);
        conferenceRoom.removeGuestFromRoom(guest);
        assertEquals(1, conferenceRoom.numberOfGuestsInRoom());
    }
}
