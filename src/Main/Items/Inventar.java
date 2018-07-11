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

    /***
     * Beschreibung eines gesuchten  Elementes aus dem Inventar
     * @param itemName der Name des Items
     */
    public void getItemDetails(String itemName){
        for(genericItem item : inventar){
            if(item.getItemName() == itemName){
                System.out.println(item.getDescription());
            }
        }
    }



    /**
     * Ausgabe des Inventares
     */
    public void getInventar(){
        if(inventar.size() == 0){
            System.out.println(Colorlog.red(TextStorage.EMPTY_INVENTORY));
        }else{
            System.out.println(TextStorage.INVENTORY_START_MESSAGE);

            for(genericItem item : inventar){
                if(item != null) {
                    System.out.print(Colorlog.yellow(TextStorage.LINE_FILLER));
                    System.out.println(item.getItemName());
                    System.out.println(Colorlog.white(TextStorage.INVENTORY_DESCRIPTION + item.getDescription()));
                    System.out.println();
                }
            }
        }
    }
}
