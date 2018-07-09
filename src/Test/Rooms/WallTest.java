package Test.Rooms;

import Main.Items.Kiste;
import Main.Items.genericItem;
import Main.Rooms.Wall;
import Main.TextParser.Colorlog;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class WallTest {

    /***
     * Testen der unterschiedlichen Konstruktoren
     */

    //Wand ohne irgendwelche Parameter
    @Test
    public void basicConstructor(){
        Wall basicWand = new Wall();
        assertEquals("An dieser hier befindet sich nichts", basicWand.getWallDescription());
    }


    // Wand mit Beschreibung ohne Gegenstand
    @Test
    public void inspectDescribedWall() {
        String description = "Du kannst die Berge aus dem Fenster aus sehen. Es fällt dir auf dass eine Zahl in das Glas geritzt ist";

        Wall aRoomWithAView = new Wall(description);
        assertEquals("Du kannst die Berge aus dem Fenster aus sehen. Es fällt dir auf dass eine Zahl in das Glas geritzt ist", aRoomWithAView.getWallDescription());
        assertEquals("Es gibt hier keinen Gegenstand", aRoomWithAView.inspectWallObject());
    }


    // Wand mit einer Beschreibung und einem Item
    @Test
    public void wallWithUnlockedBox(){
        String description = "Du kannst die Berge aus dem Fenster aus sehen. Es fällt dir auf dass eine Zahl in das Glas geritzt ist";
        genericItem pult = new genericItem("pult");

        // Generieren der Wand
        Wall aRoomWithADescription = new Wall(description,"pult",pult);

        //Testen der Beschreibung
        assertEquals("Du kannst die Berge aus dem Fenster aus sehen. Es fällt dir auf dass eine Zahl in das Glas geritzt ist", aRoomWithADescription.getWallDescription());
        assertEquals(pult, aRoomWithADescription.openBox());
        assertEquals(null,aRoomWithADescription.openBox());
        Colorlog.red(aRoomWithADescription.inspectWallObject());

        assertEquals("An dieser Wand befindet sich: pult\n",aRoomWithADescription.inspectWallObject());
    }


    // Wand mit einer Beschreibung und einer unverschlüsselten Kiste (mit einem Gegenstand)
    @Test
    public void wallWithLockedBox() {

        //Erstelle Beschreibung und Item
        String description = "Es sieht so aus, als ob sich an der Wand eine Kiste befinden würde";
        genericItem key = new genericItem("Schlüssel");

        //Erstelle Wandobjekt
        Wall wallWithBox = new Wall(description,key,"Verschlüsselte Kiste",1111);

        //Testen der Wandbeschreibung
        assertEquals("Es sieht so aus, als ob sich an der Wand eine Kiste befinden würde",wallWithBox.getWallDescription());

        //Testen ob Kiste beschrieben wird
        assertEquals("An dieser Wand befindet sich: Verschlüsselte Kiste\n", wallWithBox.inspectWallObject());

        //Versuche die verschlossene True zu öffnen
        // TODO: assertEquals();



    }

    @Test
    public void openLockedBox() {
    }
}