/**
 * Gewisse Gegenstände wie Türen oder Kisten haben spezielle Fähigkeiten und sind deshalb ausgelagert.
 * Währen dem Spiel ist es möglich Unterschiedliche Gegenstände zu Sammeln. Damit nicht jeder Gegenstand eine neue Javaklasse braucht
 * haben wir ein generisches Item erstellt um daraus alle beliebigen anderen Gegenstände zu formen.
 */
package Main.Items;


import Main.TextParser.Colorlog;

public class genericItem {
    private String name;
    private String description;


    public genericItem(String name, String description){
        this.name = name;
        this.description = description;
    }


    //Gibt den namen String zurück
    public String getItemName(){
        return this.name;
    }

    /**
     * Beschreibung des Gegenstandes
     */
    public String getDescription(){
        return this.description;
    }




}
