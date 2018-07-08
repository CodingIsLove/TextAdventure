package Main.Hero;

import Main.Items.genericItem;
import Main.Rooms.Room;
import Main.TextParser.Colorlog;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Hero {

    private String name;
    private boolean isAlive = true;
    private int frustrationsLimit = 0;
    private Room aktuellerRaum;

    //TODO write Inventarklasse private  inventar;
    //TODO add the current map

    //TODO Setter und Getter Funktionen
    //TODO Infoboard  -- Current Stat


    // Setze Namen
    public Hero(String name){
        this.name = name;
    }


    /**
     * Der Held nimmt Schaden. Falls dies seine Frustrationisgrenze auf über 100 bringt ist das Spiel vorbei
     * @param damage Schaden, welcher genommen wird
     * @throws InterruptedException Falls TimeUnit.SECONDS.sleep() Probleme aufweist, dann gibt es eine Fehlermeldung
     */
    public void takeDamage(int damage) throws InterruptedException {

        frustrationsLimit += damage;
        if(frustrationsLimit>= 100){
            for(int i = 0; i<4; i++){
                Colorlog.red("Fuck");
                try {
                    TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException err){
                    Colorlog.red("UUps there was an Error with the timeout!! " + err);
                }
            }
            System.out.println("Du hast keine Lust mehr und gibts auf... das Spiel ist vorbei und gehst nach Hause");
            System.exit(0);
        }
    }


    /**
     *
     * @param healing Der Wert um welchen die Frustrationsgrenze vermindert wird
     */
    public void heal(int  healing){
        frustrationsLimit -= healing;

        //Die Frustrationsgrenze kann nicht unter Null gehen
        if(frustrationsLimit < 0){
            frustrationsLimit = 0;
        }
    }

    public String getName(){
        return this.name;
    }


    //TODO nochmals nachschauen, ob dies Funktion wirklich nötig ist
    //Check if hero is still living
    public boolean isAlive() {
        return isAlive;
    }


    public int getFrustrationslimit(){
        return frustrationsLimit;
    }
}
