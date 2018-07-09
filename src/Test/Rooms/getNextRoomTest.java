package Test.Rooms;

import Main.Enums.Directions;
import Main.Rooms.Room;
import Main.Rooms.Wall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class getNextRoomTest {

    @Test
    public void WallWithDoor(){

        //Erstellen des nächsten Raumes
        Wall nordWand = new Wall();
        Wall suedWand = new Wall();
        Wall ostWand = new Wall();
        Wall westWand = new Wall();
        Room welle7 = new Room(nordWand,suedWand,ostWand,westWand,Directions.NORTH,"Welle 7","Hier befindest du dich in der Welle 7");

        // Wand, welche eine Tür zu Welle 7 haben sollte.
        Wall door = new Wall(welle7);

        //Testen, ob alles funktioniert, wie geplant
        assertEquals(welle7, door.getNextRoom());
    }

}
