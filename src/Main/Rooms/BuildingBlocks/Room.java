package Main.Rooms.BuildingBlocks;

import Main.Enums.Directions;
import Main.Enums.KeyWords;
import Main.Enums.RoomName;
import Main.Items.Kiste;
import Main.Items.genericItem;
import Main.Rooms.AllLevels;
import Main.TextParser.Colorlog;
import Main.Texte.TextStorage;

public class Room {

    private String roomName;
    private RoomName id;
    private Wall nordWand;
    private Wall suedWand;
    private Wall ostWand;
    private Wall westWand;
    private Directions focusedDirection;  // Sollte einziger parameter mit Setter Funktion sein


/**
 * ################################
 * #        Raumkonstruktor       #
 * ################################
 */
    /**
     * Konstruktor für einen Raum. Zu einem Raum gehören die 4 Wände. Damit der Spieler Jeweils mit den Wänden interagieren kann, muss er dazu eine fokusieren.
     * Die Fokusierte Wand wird
     * @param nordWand Definition der Nordwand
     * @param suedWand Definition der Südwand
     * @param ostWand Definition der Ostwand
     * @param westWand Definition der Westwand
     * @param direction Enum das angibt welche Wand zu fokusieren ist
     * @param roomName Name des Raumes
     */
    public Room(Wall nordWand,  Wall ostWand ,Wall suedWand, Wall westWand, String roomName, RoomName id,Enum<Directions> direction){
        //Definieren der Wände
        this.nordWand = nordWand;
        this.suedWand = suedWand;
        this.ostWand = ostWand;
        this.westWand = westWand;

        //Eigenschaften Deklarieren
        this.roomName = roomName;
        this.id = id;

        //Festlegen der Fokusierten
        if(direction == Directions.NORTH){
            this.focusedDirection = Directions.NORTH;

        }else if(direction == Directions.EAST){
            this.focusedDirection = Directions.EAST;

        }else if(direction == Directions.SOUTH){
            this.focusedDirection = Directions.SOUTH;
        }else{
            this.focusedDirection = Directions.WEST;
        }
    }

    /**
     *Selber Konstruktor wie oben, nur ohne Richtungszwang
     */
    public Room(Wall nordWand, Wall ostWand, Wall suedWand, Wall westWand, String roomName, RoomName id){
        //Definieren der Wände
        this.nordWand = nordWand;
        this.suedWand = suedWand;
        this.ostWand = ostWand;
        this.westWand = westWand;
        this.id = id;
        this.roomName = roomName;
    }

    /**######################################
     * #     Getter Funktionen              #
     * ######################################*/

    public String getRoomName(){
        return roomName;
    }
    public Directions getFocusedDirection(){
        return focusedDirection;
    }
    public Wall getFocusedWall(){
        //Festlegen der Fokusierten
        if(focusedDirection == Directions.NORTH){
           return nordWand;

        }else if(focusedDirection == Directions.EAST){
            return ostWand;

        }else if(focusedDirection == Directions.SOUTH){
            return suedWand;
        }else{
            return westWand;
        }
    }
    public RoomName getRoomId(){
        return this.id;
    }


    /**
     *     ######################
     *     #    Looking         #
     *     ######################
     * */
    public void look(Directions direction){
        this.setFocusedDirection(direction);
        this.look();
    }

    public void look(){
        if(this.getFocusedWall().getBox() != null){
            System.out.println(this.getFocusedWall().getBoxName());
        }else {
            System.out.println(this.getFocusedWall().getWallName());
        }
    }



    /**
     *     ######################
     *     #    inspecting      #
     *     ######################
     * */
    public void inspect(Directions direction){
        this.setFocusedDirection(direction);
        this.inspect();
    }

    public void inspect(){
        if(this.getFocusedWall().getBox() != null) {
            System.out.println(this.getFocusedWall().getBoxDescription());
        }else {
            System.out.println(this.getFocusedWall().getWallDescription());
        }
    }


    /**
     *     ######################
     *     #    interacting     #
     *     ######################
     * */


    public void interact(){

    }


    public genericItem openKiste(){
        if(this.getFocusedWall().getBox() != null){
            return this.getFocusedWall().getBox().openKiste();
        }else{
            System.out.println(TextStorage.NO_INTERACTION);
            return null;
        }
    }

    public genericItem openKiste(int code){
        if(this.getFocusedWall().getBox() != null){
            return this.getFocusedWall().getBox().openKiste(code);
        }else{
            return null;
        }
    }


    /**######################################
     * #     Setter Funktionen              #
     * ######################################*/
    public void setFocusedDirection(Directions focusedDirection){
        this.focusedDirection = focusedDirection;
    }


    /**######################################
     * #     Allgemeine Raumfunktionen      #
     * ######################################*/


    /**
     * Gibt eine Beschreibung des Ganzen Raumes*/

    public void getRoomHelp(){
        System.out.println(Colorlog.white(TextStorage.ROOM_LOCATION));
        System.out.println(Colorlog.blue(roomName));
        System.out.println(Colorlog.white(TextStorage.ROOM_INSPECTION_NOTATION));

        //Beschreibungen Norden
        System.out.println(Colorlog.green(TextStorage.DIRECTION_NORTH));
        System.out.print(Colorlog.cyan(TextStorage.RIGHTARROW));
        System.out.println(Colorlog.white(nordWand.getWallName()));

        //Beschreibungen Osten
        System.out.println(Colorlog.green(TextStorage.DIRECTION_EAST));
        System.out.print(Colorlog.cyan(TextStorage.RIGHTARROW));
        System.out.println(Colorlog.white(ostWand.getWallName()));

        //Beschreibungen Süden
        System.out.println(Colorlog.green(TextStorage.DIRECTION_SOUTH));
        System.out.print(Colorlog.cyan(TextStorage.RIGHTARROW));
        System.out.println(Colorlog.white(suedWand.getWallName()));

        //Beschreibungen West
        System.out.println(Colorlog.green(TextStorage.DIRECTION_WEST));
        System.out.print( Colorlog.cyan(TextStorage.RIGHTARROW));
        System.out.println(Colorlog.white(westWand.getWallName()));
    }

    /**
     * Diese Funktion gibt Informationen zu den Unterschiedlichen Wänden
     * @param direction ist ein Enum, welches eines von 4 Werten annehmen kann {NORTH, EAST, SOUTH, WEST}
     * @return Die Funktion gibt die Beschreibung der entsprechenden Wand zurück
     */
    public String wallInfos(Directions direction){
        String output;
        switch (direction) {
            case NORTH:
                output = nordWand.getWallName();
                break;
            case EAST:
                output = ostWand.getWallName();
                break;
            case SOUTH:
                output = suedWand.getWallName();
                break;
            case WEST:
                output = westWand.getWallName();
                break;
            default:
                output = TextStorage.OOPS;
        }
        return output;
    }


    /**
     * ************************* Arbeiten mit einer Richtung **************************************/


    /**
     //************************** Arbeiten mit der Fokusierten Wand ********************************/


}

