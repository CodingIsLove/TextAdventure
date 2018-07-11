package Test.Items;

import Main.Items.Inventar;
import Main.Items.genericItem;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventarTest {

    //Erstelle eine Inventar
    Inventar inventar = new Inventar();

    //Erstellen von einigen dummy genericItems
    genericItem fussball = new genericItem("Fussball","macht spass");
    genericItem schatz = new genericItem("schatz","ist viel Wert");
    genericItem key = new genericItem("Schlüssel","kann türen öffnen");


    // Fülle Inventar mit dummy items
    @Test
    public void addItem() {
        inventar.addItem(fussball);
        inventar.addItem(schatz);
        inventar.addItem(key);
    }


    @Test
    public void getInventar(){
        inventar.addItem(fussball);
        inventar.addItem(schatz);
        inventar.addItem(key);

        System.out.println("------------ Get All Inventar Ausgabe ");
        inventar.logInventar();
    }

    @Test
    public void getItemDetails() {
        inventar.addItem(fussball);
        inventar.addItem(schatz);
        inventar.addItem(key);

        System.out.println("------------ Get details Ausgabe ");

        inventar.getItemDetails("Fussball");
    }
}