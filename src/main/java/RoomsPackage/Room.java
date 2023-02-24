package RoomsPackage;

import GuestPackage.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    //instance variables:
    private ArrayList<Guest> guests;

    //constructor function:
    public Room(int capacity) {
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }
    //getter:
    public int getCapacity() {
        return this.capacity;
    }
    public void addGuestToRoom(Guest guest) {
        this.guests.add(guest);
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int numberOfGuestsInRoom() {
        return guests.size();
    }

    public void removeGuestFromRoom(Guest guest) {
        this.guests.remove(guest);
    }
}
