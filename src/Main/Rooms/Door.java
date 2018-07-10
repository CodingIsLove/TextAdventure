package Main.Rooms;

public class Door {
    private Room room1;
    private Room room2;

    public Door(Room room1, Room room2){
        this.room1 = room1;
        this.room2 = room2;
    }


    public Room enterNextRoom(Room currentRoom){
        if(currentRoom == room1){
            return room2;
        }else{
            return room2;
        }
    }

}
