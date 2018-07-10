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


    @Test
    public void doorsBahnhof(){
        Room currentRoom = AllLevels.bahnhof;

        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.welle7.getRoomName(),currentRoom.getRoomName());

    }
    @Test
    public void doorsWelle(){

        Room currentRoom = AllLevels.welle7;

        // Durchgang Bahnhof
        currentRoom.setFocusedDirection(Directions.WEST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.bahnhof.getRoomName(),currentRoom.getRoomName());

        // Durchgang 1Etage
        currentRoom = AllLevels.welle7;
        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.etage1.getRoomName(),currentRoom.getRoomName());
    }

    @Test
    public void doors1Etage(){
        Room currentRoom = AllLevels.etage1;

        // Durchgang Welle7
        currentRoom.setFocusedDirection(Directions.WEST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.welle7.getRoomName(),currentRoom.getRoomName());

        // Durchgang 2 Etage
        currentRoom = AllLevels.etage1;
        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.etage2.getRoomName(),currentRoom.getRoomName());

        // Durchgang WC
        currentRoom = AllLevels.etage1;
        currentRoom.setFocusedDirection(Directions.NORTH);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.wc.getRoomName(),currentRoom.getRoomName());

    }
    @Test
    public void doorsWC(){
        Room currentRoom = AllLevels.wc;

        // Durchgang Etage1
        currentRoom.setFocusedDirection(Directions.SOUTH);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.etage1.getRoomName(),currentRoom.getRoomName());
    }


    @Test
    public void doorEtage2(){
        Room currentRoom = AllLevels.etage2;

        // Durchgang Studienraum
        currentRoom.setFocusedDirection(Directions.NORTH);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.studienraum.getRoomName(),currentRoom.getRoomName());

        //Durchgang Obere Etage
        currentRoom = AllLevels.etage2;
        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.obereEtage.getRoomName(),currentRoom.getRoomName());

        //Durchgang Etage 1
        currentRoom = AllLevels.etage2;
        currentRoom.setFocusedDirection(Directions.WEST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.etage1.getRoomName(),currentRoom.getRoomName());
    }

    @Test
    public void doorUnterrichtsraum(){
        Room currentRoom = AllLevels.studienraum;

        // Durchgang Studienraum
        currentRoom.setFocusedDirection(Directions.SOUTH);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.etage2.getRoomName(),currentRoom.getRoomName());
    }

    @Test
    public void obereEtage(){
        Room currentRoom = AllLevels.obereEtage;

        // Durchgang Büro
        currentRoom.setFocusedDirection(Directions.EAST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.office.getRoomName(),currentRoom.getRoomName());

        currentRoom = AllLevels.obereEtage;

        // Durchgang Etage2
        currentRoom.setFocusedDirection(Directions.WEST);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.etage2.getRoomName(),currentRoom.getRoomName());
    }

    @Test
    public void office(){
        Room currentRoom = AllLevels.office;

        // Durchgang Büro
        currentRoom.setFocusedDirection(Directions.NORTH);
        currentRoom = currentRoom.getFocusedWall().useDoor();
        assertEquals(AllLevels.obereEtage.getRoomName(),currentRoom.getRoomName());

    }




}