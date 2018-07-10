package Test.Items;

import Main.Items.genericItem;
import Main.Texte.TextStorage;
import org.junit.Test;

import static org.junit.Assert.*;

public class genericItemTest {

    //Erstellen eines Objektes und Testen des Namens und Beschreibung
    @Test
    public void generateItem(){
        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);

        //Test ob der Gegenstand den richtigen String liefert
        assertEquals(TextStorage.TEST_ITEM_NAME, item.getItemName());
    }

    @Test
    public void getDescription(){
        genericItem item = new genericItem(TextStorage.TEST_ITEM_NAME,TextStorage.TEST_ITEM_DESCRIPTION);

        System.out.println(item.getDescription());
    }


}