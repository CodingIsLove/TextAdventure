/**
 * Gewisse Gegenstände wie Türen oder Kisten haben spezielle Fähigkeiten und sind deshalb ausgelagert.
 * Währen dem Spiel ist es möglich Unterschiedliche Gegenstände zu Sammeln. Damit nicht jeder Gegenstand eine neue Javaklasse braucht
 * haben wir ein generisches Item erstellt um daraus alle beliebigen anderen Gegenstände zu formen.
 */
package Main.Items;


import Main.TextParser.Colorlog;

import java.awt.*;

public class genericItem {
    private String name;
    //TODO herausfinden, wie den Purpose verwenden
    private String purpose = "Hmmm ich weiss nicht, wozu ich diesen Gegenstand verwenden kann.";


    //TODO Noch weitere Eigenschaften hinzufügen bsp HP, EP, PRÜFUNGEN etc.
    //Dies wäre auch durch vererbung möglich!


    public genericItem(String name){
        this.name = name;
    }
    public genericItem(String name, String purpose){
        this.name = name;
        this.purpose = purpose;
    }


    //Gibt den namen String zurück
    public String getItemName(){
        return name;
    }

    public void getDescription(){
        Colorlog.blue(this.name +"\n");

        if(purpose != ""){
            Colorlog.cyan("---> " + purpose + "\n");
        }

    }




}
