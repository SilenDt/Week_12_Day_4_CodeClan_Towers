package RoomsPackage;

public enum RoomType {
    //attach value to enum:

    SINGLE(1),
    DOUBLE(2),
    TWIN(2),
    CONFERENCE(50);

    //constructor function
    private final int capacity;
    RoomType(int capacity) {
        this.capacity = capacity;
    }

    //getter:
    public int getCapacity() {
        return this.capacity;
    }



}
