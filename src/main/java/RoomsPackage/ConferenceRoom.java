package RoomsPackage;

public class ConferenceRoom extends Room {
    //Instance variable:
    private String name;

    //Constructor Function:
    public ConferenceRoom(String name, int capacity)  {
        super(capacity);
        this.name = name;
    }


    public String getRoomName() {
        return this.name;
    }
}
