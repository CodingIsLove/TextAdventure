package Test.Items;

import Main.Items.genericItem;
import org.junit.Test;

import static org.junit.Assert.*;

public class genericItemTest {



    //Erstellen eines Objektes
    @Test
    public void generateItem(){
        genericItem item = new genericItem("Fussball");
        //Test ob der Gegenstand den richtigen String liefert
        assertEquals("Fussball", item.getItemName());
    }

    //Testen der Beschreibung
    @Test
    public void logNachrichten(){
        genericItem item = new genericItem("Rucksack");
        //Logge die Beschreibung von einem Rucksack
        item.getDescription();

        //TODO erweitern, wenn Objekt mehr Eigenschaften besitzt
    }


    //Ein objekt mit einen "purpose" hinzufügen
    @Test
    public void purpose(){
        genericItem item = new genericItem("Messer","Es schneidet Gegenstände");
        item.getDescription();
    }

}