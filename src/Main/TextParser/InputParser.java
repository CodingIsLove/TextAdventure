package Main.TextParser;
import Main.Enums.Directions;
import Main.Graphics.Graphics;
import Main.Hero.Hero;
import Main.Texte.TextStorage;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Die Klasse Input parser erlaubt es uns mit einem Helden zu Interagieren.
 * In der "PlayMe" Klasse wird über den Scanner ein Befehl eingelesen.
 * Dieser String wird dem Input parser übergeben. Er versucht die entsprechende Aktion
 * zu finden und führt die gewünschte Funktion aus.
 */

public class InputParser {
    private Hero hero;

    /**
     * ###############################
     * #   Konstruktor              #
     * ###############################*/

    public InputParser(Hero hero){
        this.hero = hero;
    }


    public static void fileReader(String fileDestination) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileDestination))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * ###############################
     * #    REGEX PATTERN            #
     * ###############################*/

    Pattern go_somewhere = Pattern.compile(TextStorage.PATTERN_GO);
    Pattern north = Pattern.compile(TextStorage.NORTH);
    Pattern east = Pattern.compile(TextStorage.EAST);
    Pattern south = Pattern.compile(TextStorage.SOUTH);
    Pattern west = Pattern.compile(TextStorage.WEST);
    Pattern help = Pattern.compile(TextStorage.HELP);
    Pattern look = Pattern.compile(TextStorage.LOOK);
    Pattern inspect = Pattern.compile(TextStorage.INSPECT);
    Pattern say = Pattern.compile(TextStorage.SAY);
    Pattern inventory = Pattern.compile(TextStorage.INVENTORY);
    Pattern i_see = Pattern.compile(TextStorage.I_SEE);
    Pattern where_am_i = Pattern.compile(TextStorage.WHERE_AM_I);
    Pattern room = Pattern.compile(TextStorage.ROOM_DESCRIPTION);
    Pattern interact = Pattern.compile(TextStorage.INTERACT);
    Pattern codeEnding = Pattern.compile(TextStorage.CODE_INPUT);
    Pattern map = Pattern.compile(TextStorage.MAP);
    Pattern manual = Pattern.compile(TextStorage.MANUAL);


    /**
     * Diese Funktion ist der Kern diese Klasse. Ein String wird auf unterschiedliche Regexpattern geprüft.
     * Erfüllt ein String ein bestimmtes Pattern, so wird der Held modifiziert und der Raum und die aktuellen
     * Parameter ändern sich
     * @param command Ausdruck, welcher zu analysieren ist
     */
    public void evaluate(String command) throws FileNotFoundException {

        command = command.toUpperCase();

        /**
         *Raumbeschreibung*/
        if(room.matcher(command).matches()){
            hero.getAktuellerRaum().getRoomHelp();
        }

        /**
         * Wand fokusieren
         */
        if(look.matcher(command).matches()){
            if(north.matcher(command).matches()){
                hero.getAktuellerRaum().look(Directions.NORTH);
            }else if(east.matcher(command).matches()){
                hero.getAktuellerRaum().look(Directions.EAST);
            }else if(south.matcher(command).matches()){
                hero.getAktuellerRaum().look(Directions.SOUTH);
            }else if(west.matcher(command).matches()){
                hero.getAktuellerRaum().look(Directions.WEST);
            }else
            {
                System.out.println(TextStorage.NON_VALID_EXPRESSION);
            }
        }

        /**
         * Die Aktuelle Wand beschreiben
         */
        if(inspect.matcher(command).matches()){
            if(north.matcher(command).matches()){
                hero.getAktuellerRaum().inspect(Directions.NORTH);
            }else if(east.matcher(command).matches()){
                hero.getAktuellerRaum().inspect(Directions.NORTH.EAST);
            }else if(south.matcher(command).matches()){
                hero.getAktuellerRaum().inspect(Directions.NORTH.SOUTH);
            }else if(west.matcher(command).matches()){
                hero.getAktuellerRaum().inspect(Directions.NORTH.WEST);
            }else
            {
                hero.getAktuellerRaum().inspect();
            }
        }


        /**
         * Die Türe verwenden
         */
        if(go_somewhere.matcher(command).matches()){
            if(north.matcher(command).matches()){
                hero.changeRoom(Directions.NORTH);
                System.out.println(TextStorage.CHANGED_ROOM + hero.getAktuellerRaum().getRoomName());
            }else if(east.matcher(command).matches()){
                hero.changeRoom(Directions.EAST);
                System.out.println(TextStorage.CHANGED_ROOM + hero.getAktuellerRaum().getRoomName());
            }else if(south.matcher(command).matches()){
                hero.changeRoom(Directions.SOUTH);
                System.out.println(TextStorage.CHANGED_ROOM + hero.getAktuellerRaum().getRoomName());
            }else if(west.matcher(command).matches()){
                hero.changeRoom(Directions.WEST);
                System.out.println(TextStorage.CHANGED_ROOM + hero.getAktuellerRaum().getRoomName());
            }else{
                System.out.println(TextStorage.NO_DOOR_HERE);
                System.out.println(TextStorage.CHANGED_ROOM + hero.getAktuellerRaum().getRoomName());
            }
        }


        /**
         * Beschreibe, was ich gerade sehe
         */
        if(i_see.matcher(command).matches()){
            hero.getAktuellerRaum().look();
        }


        /**
         * Gibt Auskunft übe den Aktuellen Raum
         */
        if(where_am_i.matcher(command).matches()){
            System.out.println(Colorlog.white(TextStorage.ROOM_LOCATION) + Colorlog.blue(hero.getAktuellerRaum().getRoomName()));
            System.out.println(Colorlog.white(TextStorage.VIEW) + Colorlog.blue(hero.getAktuellerRaum().getFocusedWall().getWallName()));
        }


        /**
         * interaktion mit einer Wand
         */
        if(interact.matcher(command).matches() || say.matcher(command).matches()){

            if(codeEnding.matcher(command).matches()){
                hero.openKiste(Integer.parseInt(command.replaceAll("[^\\d]","")));
            }else{
                hero.openKiste();
            }
        }


        /**
         * Anzeigen des Inventars
         */
        if(inventory.matcher(command).matches()) {
            hero.logInventar();
        }


        /**
         * Anzeigen der Karte
         */
        if(map.matcher(command).matches()){
            Graphics.printWorld();
        }

        /**
         * Hilfe anzeigen
         */

        if(help.matcher(command).matches()){
            String basePath = new File("").getAbsolutePath();
            if(manual.matcher(command).matches()){
                InputParser.fileReader(basePath.concat("/src/Main/Texte/SpielAnleitung.txt"));
            }else{
                InputParser.fileReader(basePath.concat("/src/Main/Texte/help.txt"));
            }
        }
    }




}
