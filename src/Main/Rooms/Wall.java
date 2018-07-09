package Main.Rooms;

import Main.Items.Kiste;
import Main.Items.genericItem;
import Main.Texte.TextStorage;

/***
 * Die Klasse Wall kann unterschiedliche Objekte besitzen. Es kann sein, dass sie gar nichts hat, eine Tür oder eine Kiste besitzt
 * //TODO weitere Objekte hinzufügen, falls nötig
 */

public class Wall {

    private genericItem item = null;
    private Kiste box = null;
    private String wallDescription = null;
    private Room nextRoom = null;


    /***
     * Generieren einer leeren Wand
     */
    public Wall(){}

    /**
     * Generieren einer Wand mit beschreibung
     * @param wallDescription beschreibt die Wand
     */
    public Wall(String wallDescription){
        this.wallDescription = wallDescription;
    }

    /***
     * Generieren einer Wand, an welcher eine unverschlüsselte Kiste steht
     * @param wallDescription Beschreibung um was für eine Wand es sich handelt (z.B Kiste, Truhe, Schrank, Blumentopf etc.)
     * @param boxName Ist der Name der Box
     * @param item Ist der Gegenstand welcher sich in der Box befinden sollte
     */
    public Wall(String wallDescription, String boxName, genericItem item){
        this.wallDescription = wallDescription;
        this.box = new Kiste(item,boxName);
    }

    /***
     * Generieren einer Wand, an welcher eine verschlüsselte Kiste steht
     * @param wallDescription beschreibt die Wand
     * @param item ist ein Item
     */
    public Wall(String wallDescription, String boxName, genericItem item, int code){
        this.wallDescription = wallDescription;
        this.box = new Kiste(item,boxName,code);
    }

    public Wall(Room nextRoom){
        this.nextRoom = nextRoom;
        this.wallDescription = TextStorage.WALL_DESCRIPTION_START + nextRoom.getRoomName() + TextStorage.WALL_DESCRIPTION_END;
    }



    /**
     * Gibt die Beschreibung der Wand zurück. Sagt, ob es eine Kiste, Türe oder nichts gibt.
     * @return Beschreibung der Wand
     */
    public String getWallDescription(){
        if(wallDescription != null){
            return wallDescription;
        }else if(nextRoom != null){
            return TextStorage.WALL_DOOR_TO_DIRECTION + nextRoom.getRoomName();
        }
        else{
            return TextStorage.WALL_EMPTY;
        }
    }


    /***
     * Falls sich an der Wand ein spezieller Gegenstand wie eine Kiste befindet, so wird
     * diese beschrieben.
     * @return Gibt das Inspect-Ergebnis zurück
     */
    public String inspectWallObject(){
        //TODO später hier noch eine Option für die Türe hinzufügen
        if(item != null){
            return TextStorage.WALL_INSPECTION_START + item.getItemName() + TextStorage.LINEBREAK;
        }else if(box != null){
            return TextStorage.WALL_INSPECTION_START + box.getKistenName()+ TextStorage.LINEBREAK;
        }
        else {
            return TextStorage.WALL_INSPECTION_EMPTY; //TODO: TESTS ändern
        }
    }

    public genericItem openBox(){
        if(box == null){
            return null;
        }else{
            return box.openKiste();
        }
    }


    /**
     * Öffnen einer verschlossenen Box
     * @param code Code um die Kiste zu öffnen
     * @return Falls der Code richtig eingegeben, kommt das Item in der Kiste zurück
     */
    public genericItem openLockedBox(int code){
        box.unlockKiste(code);
        return box.openKiste();
    }


    public Room getNextRoom(){
        return nextRoom;
    }




}
