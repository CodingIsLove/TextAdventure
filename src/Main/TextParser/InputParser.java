package Main.TextParser;
import Main.Hero.Hero;
import Main.Texte.TextStorage;

import java.util.Arrays;
import java.util.List;

/**
 * Die Klasse Input parser erlaubt es uns mit einem Helden zu Interagieren.
 * In der "PlayMe" Klasse wird über den Scanner ein Befehl eingelesen.
 * Dieser String wird dem Input parser übergeben. Er versucht die entsprechende Aktion
 * zu finden und führt die gewünschte Funktion aus.
 */

public class InputParser {

    /***
     * Keywords und Syntax für Interaktion mit Raum
     *
     * INSPECT <DIRECTION>|<Wall>|<Kiste>             --> Verwenden für Räume, Wände
     * GO <DIRECTION>                                 --> Verwenden für Räume  sollte Raum Wechseln
     * HELP [<WALLNAME>|<DIRECTION>|<Kiste>]          --> Verwenden für allgemeine Hilfe, oder für Hilfe zu Objekten oder Richtunge
     * TAKE <genericObject>                           --> Verwenden für Objekte im Raum oder Objekte in Kisten
     * OPEN <Kiste>                                   --> Verwenden für Verschlüsselt|Unverschlüsselte Kiste
     * TALK <Person>                                  --> Verwenden um mit einer Person zu interagieren
     * * LOOK <Direction>                               --> Verwenden für Raum
     * USE <inventarObject> for  <genericObject>      -->
     * PUT <genericObject> in <Kiste>
     */



    private Hero hero;


    /**
     * ###############################
     * #   Nützliche Befehlslisten   #
     * ###############################*/

    List<String> directions = Arrays.asList(TextStorage.DIRECTION_NORTH,TextStorage.DIRECTION_EAST,TextStorage.DIRECTION_SOUTH,TextStorage.DIRECTION_WEST);


    /**
     * ###############################
     * #   Konstruktor              #
     * ###############################*/

    public InputParser(Hero hero){
        this.hero = hero;
    }



    /**
     * ###############################
     * #   Text evaluation           #
     * ###############################*/
    public void evaluate(String command){

        command = command.toUpperCase();

        /**
         *Held benötigt Hilfe*/
        if(command.equals(TextStorage.HELP)){
            hero.getAktuellerRaum().getRoomHelp();
        }


        /**
         * Wände fokusieren
         * // TODO: do this shit later
         */
    }






}
