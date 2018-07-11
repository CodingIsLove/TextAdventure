package Test.Rooms;

import Main.Items.Kiste;
import Main.Items.genericItem;
import Main.Rooms.BuildingBlocks.Wall;
import Main.Texte.TextStorage;
import org.junit.Test;

import static org.junit.Assert.*;

public class WallTest {


    //----------- Testing with described Wall
    @Test
    public void getWallName() {
        Wall simpleWall = new Wall(TextStorage.TEST_WALL_NAME, TextStorage.TEST_WALL_DESCRIPTION);

        // Sehen ob die Basis Infos verfügbar sind
        assertEquals(TextStorage.TEST_WALL_NAME, simpleWall.getWallName());
        assertEquals(TextStorage.TEST_WALL_DESCRIPTION, simpleWall.getWallDescription());
    }


    @Test
    public void openUnlockedBox() {
        System.out.println("----------------- Unlocked Box -----------------------");

        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);
        Kiste box = new Kiste(TextStorage.TEST_BOX_NAME, TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,TextStorage.TEST_OPEN_MESSAGE,TextStorage.TEST_EMPTY_MESSAGE,item);

        Wall unlockedWall = new Wall(TextStorage.TEST_WALL_NAME,TextStorage.TEST_WALL_DESCRIPTION,box);


        // Get informations about box
        assertEquals(TextStorage.TEST_BOX_NAME,unlockedWall.getBoxName());
        assertEquals(TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,unlockedWall.getBoxDescription());
        assertEquals(item, unlockedWall.openBox());
        assertEquals(null, unlockedWall.openBox());
    }

    @Test
    public void openLockedBox() {
        System.out.println("----------------- Locked Box -----------------------");

        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);
        Kiste box = new Kiste(TextStorage.TEST_BOX_NAME, TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,TextStorage.TEST_OPEN_MESSAGE,TextStorage.TEST_EMPTY_MESSAGE,item,TextStorage.TEST_DENY_BOX_ACCESS,10);

        Wall lockedWall = new Wall(TextStorage.TEST_WALL_NAME,TextStorage.TEST_WALL_DESCRIPTION,box);


        // Get informations about box
        assertEquals(TextStorage.TEST_BOX_NAME,lockedWall.getBoxName());
        assertEquals(TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,lockedWall.getBoxDescription());
        assertEquals(null, lockedWall.openBox());
        assertEquals(item, lockedWall.openBox(10));
        assertEquals(null, lockedWall.openBox());
    }


    @Test
    public void wallInfo(){
        System.out.println("----------------- Wall Info -----------------------");
        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);
        Kiste box = new Kiste(TextStorage.TEST_BOX_NAME, TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,TextStorage.TEST_OPEN_MESSAGE,TextStorage.TEST_EMPTY_MESSAGE,item,TextStorage.TEST_DENY_BOX_ACCESS,10);

        Wall lockedWall = new Wall(TextStorage.TEST_WALL_NAME,TextStorage.TEST_WALL_DESCRIPTION,box);

        lockedWall.wallInfo();

    }

}