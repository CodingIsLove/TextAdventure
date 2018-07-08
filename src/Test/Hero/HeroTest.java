package Test.Hero;

import Main.Hero.Hero;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    private Hero chris = new Hero("chris");


    //Einfacher Funktionstest
    @Test
    public void basicFunctionality() throws InterruptedException {

        //Frustrationslevel sollte zu beginn auf 0 liegen
        assertEquals(0,chris.getFrustrationslimit());

        //Schaden nehmen
        chris.takeDamage(30);
        assertEquals(30,chris.getFrustrationslimit());

    }


    @Test
    public void takeDamage() throws InterruptedException {
        chris.takeDamage(30);
        assertEquals(30,chris.getFrustrationslimit());
    }


    //Testen ob die Heilfunktion klappt
    @Test
    public void heal() throws InterruptedException {
        chris.takeDamage(50);
        chris.heal(30);
        assertEquals(20,chris.getFrustrationslimit());
    }

    @Test
    public void getName() {
        assertEquals("chris", chris.getName());
    }

    @Test
    public void isAlive() {
        assertEquals(true,chris.isAlive());
    }

    @Test
    public void getFrustrationslimit() throws InterruptedException {
        chris.takeDamage(99);
        assertEquals(99,chris.getFrustrationslimit());

    }


    /**
     * Dieser Test verursacht ein gewolltest System exit, falls der Protagonist stirbt
    @Test
    public void bored_to_death() throws InterruptedException {
        chris.takeDamage(200);
    }

    */
}