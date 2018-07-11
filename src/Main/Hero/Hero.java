package Main.Hero;

import Main.Items.Inventar;
import Main.Items.genericItem;
import Main.Rooms.BuildingBlocks.Room;
import Main.Rooms.BuildingBlocks.Wall;
import Main.TextParser.Colorlog;
import Main.Texte.TextStorage;

import java.util.concurrent.TimeUnit;

public class Hero {

    private String name;
    private boolean isAlive = true;
    private int frustrationsLimit = 0;
    private Inventar inventar;
    private Room aktuellerRaum;
    private Wall focusedWall;

    //TODO überlegen, ob das frustrationslimit überaupt noch implementierbar ist
    //TODO add the current map
    //TODO Infoboard  -- Current Stat
    //TODO: schreiben der Funktionen, welche für den Sprachparser verwendet werden müssen


    /**
     * #####################
     * #    Konstruktor    #
     * #####################
     */
    public Hero(String name, Room start){
        this.name = name;
        this. aktuellerRaum = start;
        this.focusedWall = start.getFocusedWall();
    }

    /**####################
     * #Setter Funktionen #
     * ####################
     */

    public void addItemToInventar(genericItem item){
        inventar.addItem(item);
    }

    public void setRoom(Room neuerRaum){
        this.aktuellerRaum = neuerRaum;
    }

    /**####################
     * #Getter funktionen #
     * ####################
     */

    public void showInventar(){
       inventar.getInventar();
    }

    public void showItemDescription(String itemName){
        inventar.getItemDetails(itemName);
    }

    public void showRoomOverview(){
        aktuellerRaum.getRoomHelp();
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
                Colorlog.red(TextStorage.TAKE_DAMAGE);
                try {
                    TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    Colorlog.red(TextStorage.INTERRUPT_EXCEPTION_WARNING + e);
                }
            }
            System.out.println(TextStorage.GAME_OVER);
            System.exit(0);
        }
    }


    /**
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


    public int getFrustrationslimit(){
        return frustrationsLimit;
    }
}
