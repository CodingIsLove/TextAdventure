package Test.Rooms;

import Main.Enums.Directions;
import Main.Rooms.AllLevels;
import Main.Rooms.BuildingBlocks.Room;
import Main.Rooms.BuildingBlocks.Wall;
import Main.Texte.TextStorage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/***
 * Einfacher Test, ob die Funktionen des Raumes funktionieren
 */

public class RoomTest {

    @Test
    public void getRoomDescription() {
        assertEquals(TextStorage.ROOM_NAME_WELLE7,AllLevels.welle7.getRoomName());
    }

    @Test
    public void setRoomDirection(){

        Room currentRoom = AllLevels.welle7;

        //Setzten erster Raumrichtung und auslesen
        currentRoom.setFocusedDirection(Directions.NORTH);
        assertEquals(Directions.NORTH, currentRoom.getFocusedDirection());

    }

    @Test
    public void getRoomName() {

        Room currentRoom = AllLevels.bahnhof;

        assertEquals(TextStorage.ROOM_NAME_PLATFORM, currentRoom.getRoomName());
    }

    @Test
    public void wallInfos(){
        Room currentRoom = AllLevels.bahnhof;

        // Schauen, ob die Infos zu allen Wänden
        assertEquals(TextStorage.WALL_NAME_PLATFORM, currentRoom.wallInfos(Directions.NORTH));
        assertEquals(TextStorage.WALL_NAME_PLATFORM, currentRoom.wallInfos(Directions.SOUTH));
        assertEquals(TextStorage.WALL_NAME_DEAD_END, currentRoom.wallInfos(Directions.EAST));
        assertEquals(TextStorage.WALL_NAME_ESCALATOR, currentRoom.wallInfos(Directions.WEST));

    }

    @Test
    public void interactWithWall() {
    }

    @Test
    public void getNiceRoomDescription(){

        Room currentRoom = AllLevels.bahnhof;


        // Console log einer schönen beschreibung
        currentRoom.getRoomHelp();

    }

}