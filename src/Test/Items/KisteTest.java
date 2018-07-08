package Test.Items;

import Main.Items.Kiste;
import Main.Items.genericItem;
import org.junit.Test;

import static org.junit.Assert.*;

public class KisteTest {


    // Test mit einer unverschlüsselten Kiste
    @Test
    public void unlockedKiste(){

        //Generieren von Testobjekten
        genericItem schatz = new genericItem("Schatz");
        genericItem fussball = new genericItem("Fussball");
        Kiste box1 = new Kiste(schatz,"Schatzkiste");


        //###Testing
        //Die Kiste sollte kein Schloss haben
        assertFalse(box1.isLocked());

        //Wenn die Kiste geöffnet wird sollte sie den Schatz zurückgeben
        assertEquals(schatz, box1.openKiste());

        //Nun sollte kein Schatz mehr in der Kiste sein
        assertEquals(null, box1.openKiste());

        //Fussball wird neu in die Kiste gelegt
        box1.setItemInKiste(fussball);

        assertEquals(fussball,box1.openKiste());
        assertEquals(null,box1.openKiste());



    }


}