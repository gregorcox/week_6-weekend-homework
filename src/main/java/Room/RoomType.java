package Room;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    PENTHOUSE(6);

    public final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
