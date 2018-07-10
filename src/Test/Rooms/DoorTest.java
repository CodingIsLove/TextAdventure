package Test.Rooms;

import Main.Rooms.Room;
import Main.Rooms.Wall;
import Main.Texte.TextStorage;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoorTest {

    @Test
    public void enterNextRoom() {

        //Raum 1 beschreiben
        Wall nordWand_Bahnhof = new Wall();
        Wall suedWand_Bahnhof = new Wall();
        Wall ostWand_Bahnhof = new Wall();
        Wall westWand_Bahnhof = new Wall();

        Room bahnhof = new Room();

        //Raum Welle 7
        Wall nordWand_Welle7 = new Wall();
        Wall suedWand_Welle7 = new Wall();
        Wall ostWand_Welle7 = new Wall();
        Wall westWand_Welle7 = new Wall();

        Room bahnhof = new Room();



    }
}