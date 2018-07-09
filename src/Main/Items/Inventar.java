/**
 * Inventar verwaltet eine Menge von genericItems. Es ist möglich Beschreibungen der einzelnen Items abzurufen,
 * Elemente hinzuzufügen und sie zu verwenden.
 *
 */

package Main.Items;
import Main.TextParser.Colorlog;
import Main.Texte.TextStorage;

import java.util.ArrayList;

public class Inventar {

    private ArrayList<genericItem> inventar = new ArrayList<>();

    //Konstruktor
    public Inventar(){}


    /**
     *     Hinzufügen eines items zu dem Inventar
     */
    public void addItem(genericItem item){
        inventar.add(item);
    }


    //TODO use item

    /***
     * Beschreibung eines gesuchten  Elementes aus dem Inventar
     * @param itemName der Name des Items
     */
    public void getPickedItemDetails(String itemName){
        for(genericItem item : inventar){
            if(item.getItemName().equals(itemName)){
                item.getDescription();
            }
        }
    }


    /**
     * Ausgabe des Inventares
     */
    public void getInventar(){
        if(inventar.toArray().length == 0){
            Colorlog.red(TextStorage.EMPTY_INVENTORY);
        }else{
            Colorlog.white(TextStorage.INVENTORY_START_MESSAGE);

            for(genericItem item : inventar){
                Colorlog.yellow(TextStorage.LINE_FILLER) ;
                Colorlog.white(item.getItemName() + TextStorage.LINEBREAK);
            }
        }
    }
}
