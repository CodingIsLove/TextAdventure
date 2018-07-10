package Test.Rooms;



import Main.Enums.RoomName;
import Main.Rooms.AllLevels;
import Main.Rooms.BuildingBlocks.Room;
import Main.Texte.TextStorage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllLevelsTest {

    @Test
    public void getRoomName() {

        assertEquals("Welle 7", AllLevels.welle7.getRoomName());
    }


    @Test
    public void outputRooms(){
        for(Room room : AllLevels.AllRooms){
            System.out.println(room.getRoomName());
            System.out.println();
        }
    }


    /**
     * Hell Yeah, finally! This fucking Door works
     */
    @Test
    public void roomSwitch(){
        Room currentRoom = AllLevels.welle7;
        assertEquals(TextStorage.ROOM_NAME_WELLE7,currentRoom.getRoomName());
        currentRoom = currentRoom.useDoor(RoomName.BHF);
        assertEquals(TextStorage.ROOM_NAME_PLATFORM,currentRoom.getRoomName());

    }

}