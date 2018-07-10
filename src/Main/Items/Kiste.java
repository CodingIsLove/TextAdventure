/***
 * Jede Kiste birgt einen beliebigen Gegenstand
 */


package Main.Items;
import Main.TextParser.Colorlog;
import Main.Texte.TextStorage;

public class Kiste {

    private genericItem item;
    private Integer code;
    private boolean isLocked;
    private String boxName;
    private String boxDescription;
    private String openMessage;
    private String denyBoxAccess;
    private String emptyMessage;


    /**
     * #########################
     * #    Konstruktoren      #
     * #########################*/


    /**
     * Konstruktoren für unverschlüsselte Kiste
     * @param item ist der Gegenstand welcher sich in der Kiste befindet
     */
    public Kiste(String boxName, String boxDescription,String openMessage, String emptyMessage, genericItem item){
        this.item = item;
        this.emptyMessage = emptyMessage;
        this.openMessage = openMessage;
        this.code = null;
        this.isLocked = false;
        this.boxName = boxName;
        this.boxDescription = boxDescription;
    }

    /**
     * Konstruktor für verschlüsselte Kiste
     * @param item ist der Gegenstand welcher sich in der Kiste befindet
     * @param code Ist der Code um die Kiste zu verschlüsseln
     */
    public Kiste(String name, String boxDescription,String openMessage, String emptyMessage, genericItem item,String denyBoxAccess, int code){

        this.item = item;
        this.denyBoxAccess = denyBoxAccess;
        this.code = null;
        this.isLocked = true;
        this.boxName = name;
        this.boxDescription = boxDescription;
        this.openMessage = openMessage;
        this.code = code;
    }


    /**
     * #########################
     * #  Getter functions     #
     * #########################*/

    /**
     * Kiste wird geöffnet und der Gegenstand wird dem Inventar des Spielers hinzugefügt
     * @return returns a genericItem
     */

    public String getKistenName(){
        return this.boxName;
    }
    public String getKistenDescription(){ return this.boxDescription;}


    public genericItem openKiste(){

        //Falls Kiste verschlossen ist, dann gib nichts zurück
        if(isLocked){
            System.out.println(Colorlog.red(boxName +" " + denyBoxAccess));
            return null;
        }else {
            //Falls kein Gegenstand mehr in der Kiste ist
            if (item == null) {
                System.out.println(emptyMessage);
                return null;
            } else {
                // Falls ein Gegenstand in der Kiste ist, wird dieser zurückgegeben
                genericItem item = this.item;
                System.out.println(Colorlog.yellow(TextStorage.GET_ITEM_START+ item.getItemName() + TextStorage.GET_ITEM_END));
                this.item = null;
                return item;
            }
        }
    }

    public genericItem openKiste(int code){
        unlockKiste(code);
        return this.openKiste();
    }




    /**
     * #########################
     * #  Other functions      #
     * #########################*/

    /**
     * Verschlossene Kisten öffnen
     * @param code welcher verwendet wird um die Kiste hoffentlich zu öffnen
     */
    public void unlockKiste(Integer code){
        //Falls der Code Stimmt wird die Kiste geöffnet
        if(this.code.equals(code)) {
            this.isLocked = false;
            System.out.println(Colorlog.green(openMessage));
        }else {
            System.out.println(Colorlog.red(TextStorage.BOX_LOCKED));
        }

    }


    public boolean isLocked(){
        return this.isLocked;
    }








}
