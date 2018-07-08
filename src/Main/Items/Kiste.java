/***
 * Jede Kiste birgt einen beliebigen Gegenstand
 */


package Main.Items;
import Main.TextParser.Colorlog;

import java.awt.*;

public class Kiste {

    private genericItem item;
    private Integer code;
    private boolean isLocked;
    private String boxName = "Kiste";


    /**
     * Konstruktoren für unverschlüsselte Kiste
     * @param item ist der Gegenstand welcher sich in der Kiste befindet
     */
    public Kiste(genericItem item, String name){
        this.item = item;
        this.code = null;
        this.isLocked = false;
        this.boxName = name;
    }

    /**
     * @param item ist der Gegenstand welcher sich in der Kiste befindet
     * @param code Ist der Code um die Kiste zu verschlüsseln
     */
    public Kiste(genericItem item, String name, Integer code){
        this.item = item;
        this.code = code;
        this.isLocked = true;
        this.boxName = name;
    }


    /**
     * Verschlossene Kisten öffnen
     * @param code welcher verwendet wird um die Kiste hoffentlich zu öffnen
     * @return
     */
    public void unlockKiste(Integer code){
        //Falls der Code Stimmt wird die Kiste geöffnet
        if(this.code == code) {
            this.isLocked = false;
            Colorlog.green("Wow! Der Code wurde geknackt und die Kiste ist nun offen! \n");
        }else {
            Colorlog.red("Leider Stimmt der Code nicht! \n");
        }

    }

    /**
     * Kiste wird geöffnet und der Gegenstand wird dem Inventar des Spielers hinzugefügt
     * @return
     */
    public genericItem openKiste(){

        //Falls Kiste verschlossen ist, dann gib nichts zurück
        if(isLocked){
            Colorlog.red(boxName +" ist verschlossen");
            return null;
        }else {
            //Falls kein Gegenstand mehr in der Kiste ist
            if (item == null) {
                Colorlog.white("Schade die Kiste ist bereits leer \n");
                return null;
            } else {
                // Falls ein Gegenstand in der Kiste ist, wird dieser zurückgegeben
                genericItem item = this.item;
                Colorlog.yellow("*** Gratulation " + item.getItemName() + "  wurde deinem Inventar hinzugefügt*** \n");
                this.item = null;
                return item;
            }
        }
    }

    public void setItemInKiste(genericItem item){
        this.item = item;
    }

    public void setLock(Integer code){
        this.code = code;
    }


    public boolean isLocked(){
        return this.isLocked;
    }

    public void setKistenName(String name){
        this.boxName = name;
    }

    public String getKistenName(){
        return this.boxName;
    }




}
