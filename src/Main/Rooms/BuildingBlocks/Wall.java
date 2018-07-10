package Main.Rooms.BuildingBlocks;

import Main.Enums.RoomName;
import Main.Items.Kiste;
import Main.Items.genericItem;
import Main.Rooms.AllLevels;
import Main.TextParser.Colorlog;
import Main.Texte.TextStorage;

/***
 * Die Klasse Wall kann unterschiedliche Objekte besitzen. Es kann sein, dass sie gar nichts hat, eine Tür oder eine Kiste besitzt
 * //TODO weitere Objekte hinzufügen, falls nötig
 */

public class Wall {
    private genericItem item = null;
    private Kiste box = null;
    private String wallDescription;
    private String wallName;
    private RoomName nextRoom;


    /**
     * #################
     * # Konstruktoren #
     * #################*/

    /**
     * Leerer Konstruktor, wird für Testing verwendt, damit ich nicht jedesmall einen vollen Raum generieren muss
     */
    public Wall(){};

    /**
     * Generieren einer Wand mit beschreibung
     * @param wallDescription beschreibt die Wand*/
    public Wall(String wallName, String wallDescription){
        this.wallName = wallName;
        this.wallDescription = wallDescription;
    }

    /***
     * Generieren einer Wand, an welcher eine Kiste
     * @param box  ist eine Kiste. Raumnamen und Raumbeschreibung werden von der Box übernommen*/
    public Wall(String wallName, String wallDescription, Kiste box){
        this.wallName = wallName;
        this.wallDescription = wallDescription;
        this.box = box;
    }


    /**
     * Dieser Konstruktor baut einen Durchgang
     * @param doorName Name des Durchganges
     * @param doorDescription Beschreibung des Durchganges
     */
    public Wall(String doorName,String doorDescription, RoomName nextRoom){
        this.wallDescription = doorDescription;
        this.wallName = wallDescription;
        this.nextRoom = nextRoom;
    }


    /**
     * #####################
     * # Getter Functions  #
     * #####################*/

    /**
     * Gibt den Namen der Wand zurück
     * @return Beschreibung der Wand*/
    public String getWallName(){
        if(wallName != null){
            return wallName;
        }else{
            return TextStorage.WALL_EMPTY;
        }
    }

    /**
     * Gibt die Beschreibung der Wand zurück.
     * @return*/
    public String getWallDescription(){
        if(wallDescription != null){
            return wallDescription;
        }else{
            return TextStorage.WALL_EMPTY;
        }
    }


    //################################### INTERACTION WITH THE BOX ################################
    public String getBoxName(){
         return box.getKistenName();
    }

    public String getBoxDescription(){
         return box.getKistenDescription();
    }


    public genericItem openBox(){
         return box.openKiste();

    }

    public genericItem openBox(int code){
        return box.openKiste(code);
    }

    /**
     * ####################
     * # Wall functions   #
     * ####################
     */

    public void wallInfo(){
        System.out.println(Colorlog.blue(wallName));
        System.out.println(Colorlog.white(wallDescription));
        System.out.println();
    }


    public Room useDoor(){
        for(Room singleRoom : AllLevels.AllRooms){
            if(singleRoom.getRoomId() == nextRoom) {
                return singleRoom;
            }else{

                // If something bad happens, you will get to the Bahnhof
                System.out.println("Der Raum wurde nicht gefunden");
                return AllLevels.bahnhof;
            }
        };
        return null;
    }





}
