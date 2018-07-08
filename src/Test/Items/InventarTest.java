package Test.Items;

import Main.Items.Inventar;
import Main.Items.genericItem;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventarTest {

    //Erstelle eine Inventar
    Inventar inventar = new Inventar();

    //Erstellen von einigen dummy genericItems
    genericItem fussball = new genericItem("Fussball");
    genericItem schatz = new genericItem("schatz");
    genericItem key = new genericItem("Schlüssel");


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

        //Ausgabe
        inventar.getInventar();
    }

    @Test
    public void getItemDetails() {
    }
}