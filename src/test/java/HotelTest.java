import GuestPackage.Guest;
import HotelPackage.Hotel;
import RoomsPackage.Bedroom;
import RoomsPackage.ConferenceRoom;
import RoomsPackage.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(1, RoomType.SINGLE);
        conferenceRoom = new ConferenceRoom("Red Room", 70);
        guest = new Guest("Eilidh Morone");
    }

    @Test
    public void canAddBedroomToBedrooms() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }
    @Test
    public void canAddConferenceRoomToConferenceRooms() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRoom());
    }
    @Test
    public void canCheckInGuestToBedroom() {
        hotel.checkInGuestToBedroom(guest, bedroom);

        assertEquals(1, bedroom.numberOfGuestsInRoom());
    }
}
