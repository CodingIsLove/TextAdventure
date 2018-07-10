package Test.Rooms;

import Main.Enums.Directions;
import Main.Rooms.AllLevels;
import Main.Rooms.BuildingBlocks.Room;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class getNextRoomTest {

    @Test
    public void WallWithDoor(){

        Room currentRoom = AllLevels.bahnhof;

        currentRoom.getRoomHelp();
        currentRoom.setFocusedDirection(Directions.EAST);

        currentRoom = currentRoom.getFocusedWall().useDoor();
        System.out.println();
        currentRoom.getRoomHelp();

    }


}
