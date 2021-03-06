package Test.Hero;

import Main.Enums.Directions;
import Main.Hero.Hero;
import Main.Rooms.AllLevels;
import org.junit.Test;

public class HeroTest {

    @Test
    public void changeRoom() {

        Hero chris = new Hero(AllLevels.bahnhof);

        // Hier sollte kein Inventar sein
        chris.logInventar();
        chris.getAktuellerRaum().getRoomHelp();
        chris.getAktuellerRaum().look(Directions.EAST);
        chris.changeRoom();

        chris.getAktuellerRaum().getRoomHelp();
        chris.getAktuellerRaum().look(Directions.NORTH);
        chris.getAktuellerRaum().inspect();

        chris.getAktuellerRaum().look(Directions.SOUTH);
        chris.getAktuellerRaum().inspect();
        chris.openKiste();
        chris.openKiste(10);

        // Null sollte das inventar die Linalgprüfungen haben
        chris.logInventar();

    }

}