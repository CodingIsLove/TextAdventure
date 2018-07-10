package Test.Rooms;



import Main.Enums.Directions;
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

    }

    @Test
    public void walkTrough(){

        Room currentRoom = AllLevels.bahnhof;

        System.out.println("---------------- Bahnhof -----------------");
        currentRoom.getRoomHelp();
        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.welle7,currentRoom.getRoomName());
        System.out.println();

        System.out.println("---------------- Welle 7 -----------------");
        currentRoom.getRoomHelp();
        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        System.out.println();


        System.out.println("---------------- WC -----------------");
        currentRoom.getRoomHelp();
        currentRoom.setFocusedDirection(Directions.SOUTH);
        currentRoom = currentRoom.getFocusedWall().useDoor();

        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        System.out.println();


        System.out.println("---------------- 2. Etage -----------------");
        currentRoom.getRoomHelp();
        currentRoom.setFocusedDirection(Directions.NORTH);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        System.out.println();


        System.out.println("---------------- Bahnhof -----------------");
        currentRoom.getRoomHelp();

        currentRoom.setFocusedDirection(Directions.SOUTH);
        currentRoom = currentRoom.getFocusedWall().useDoor();

        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        System.out.println();



        System.out.println("--------------- Obere Etage ---------------");
        currentRoom.getRoomHelp();

        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        System.out.println();


        System.out.println("--------------- Büro Gittig ---------------");
        currentRoom.getRoomHelp();
        System.out.println();




    }

}