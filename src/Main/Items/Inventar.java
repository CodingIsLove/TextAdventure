/**
 * Inventar verwaltet eine Menge von genericItems. Es ist möglich Beschreibungen der einzelnen Items abzurufen,
 * Elemente hinzuzufügen und sie zu verwenden.
 *
 */

package Main.Items;
import Main.TextParser.Colorlog;
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
     * @param itemName
     */
    public void getPickedItemDetails(String itemName){
        for(genericItem item : inventar){
            if(item.getItemName() == itemName){
                item.getDescription();
            }
        }
    }


    /**
     * Ausgabe des Inventares
     */
    public void getInventar(){
        if(inventar.toArray().length == 0){
            Colorlog.red("Es befindet sich nichts in deinem Inventar !");
        }else{
            Colorlog.white("Dein Inventar besteht aus: \n");

            for(genericItem item : inventar){
                Colorlog.yellow("*** ") ;
                Colorlog.white(item.getItemName() + "\n");
            }
        }
    }
}
