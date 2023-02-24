package HotelPackage;

import GuestPackage.Guest;
import RoomsPackage.Bedroom;
import RoomsPackage.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {
    //Instance Variables:
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Bedroom bedroom;

    //Constructor Function:
    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }
    //Methods:
    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public int getNumberOfBedrooms() {
        return bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public int getNumberOfConferenceRoom() {
        return conferenceRooms.size();
    }

    public void checkInGuestToBedroom(Guest guest) {
    }
}

