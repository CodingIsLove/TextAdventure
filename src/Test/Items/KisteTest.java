package Test.Items;

import Main.Items.Kiste;
import Main.Items.genericItem;
import Main.Texte.TextStorage;
import org.junit.Test;

import static org.junit.Assert.*;

public class KisteTest {


    @Test
    public void getKistenName() {
        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);
        Kiste box = new Kiste(TextStorage.TEST_BOX_NAME, TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,TextStorage.TEST_OPEN_MESSAGE,TextStorage.TEST_EMPTY_MESSAGE,item);

        assertEquals(TextStorage.TEST_BOX_NAME,box.getKistenName());
    }

    @Test
    public void getKistenDescription() {
        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);
        Kiste box = new Kiste(TextStorage.TEST_BOX_NAME, TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,TextStorage.TEST_OPEN_MESSAGE,TextStorage.TEST_EMPTY_MESSAGE,item);

        assertEquals(TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,box.getKistenDescription());
    }

    @Test
    public void openKiste() {
        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);
        Kiste box = new Kiste(TextStorage.TEST_BOX_NAME, TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,TextStorage.TEST_OPEN_MESSAGE,TextStorage.TEST_EMPTY_MESSAGE,item,TextStorage.TEST_DENY_BOX_ACCESS,10);

        assertEquals(null,box.openKiste());
    }

    @Test
    public void unlockKiste() {
        System.out.println("-------------");
        System.out.println("Handhabung einer verschlossenen Kiste");
        System.out.println("-------------");
        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);
        Kiste box = new Kiste(TextStorage.TEST_BOX_NAME, TextStorage.TEST_UNLOCKED_BOX_DESCRIPTION,TextStorage.TEST_OPEN_MESSAGE,TextStorage.TEST_EMPTY_MESSAGE,item,TextStorage.TEST_DENY_BOX_ACCESS,10);

        // versuche verschlossene Kiste zu öffnen
        assertEquals(null,box.openKiste());
        assertEquals(true,box.isLocked());

        // Kiste öffnen mit falschem Code
        box.unlockKiste(20);

        // Kiste öffnen mit richtigem Code
        box.unlockKiste(10);

        //Kiste öffnen, nachdem sie geöffnet wurde
        assertEquals(item, box.openKiste());

        //Zugeben, dass die Kiste verschlossen wurde
        assertEquals(false, box.isLocked());

    }

}