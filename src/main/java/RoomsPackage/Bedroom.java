package RoomsPackage;

import GuestPackage.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{
    //instance variable:
    private Integer roomNumber;
    private RoomType roomType;


    //constructor function:
    public Bedroom(Integer roomNumber, RoomType roomType) {
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }
    //Getters:
    public int getRoomNumber() {
        return roomNumber;
    }
    public RoomType getRoomType() {
        return roomType;
    }


    //Methods:

}
