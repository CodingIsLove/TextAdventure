package Test.Rooms;

/**
 * Wir erstellen zum Test die 4 Wände des Bahnhofes Skizze dazu
 *
 *  ########### Gleis ###########
 *  #                           #
 *  #                           #
 *  #                           #
 *Dead End               Rolltreppe Welle 7
 *  #                           #
 *  #                           #
 *  ########### Gleis ###########
 *
 */

import static org.junit.Assert.assertEquals;


public class WallGleisTest {

    /**
     *
     * todo write this test, when everything else works again
    @Test
    public void GleisCheck(){

        String beschreibung = "Hier befinden sich die Gleise vom Berner Bahnhof. Ich sollte nicht zu nahe gehen";
        Wall gleis = new Wall(beschreibung);


        //Checke die Eigenschaften der Wand
        gleis.getWallName();
        gleis.inspectWallObject();
        gleis.openBox();
        assertEquals("Hier befinden sich die Gleise vom Berner Bahnhof. Ich sollte nicht zu nahe gehen",gleis.getWallName());
        assertEquals("Es gibt hier keinen Gegenstand",gleis.inspectWallObject());
    }

    */

}
