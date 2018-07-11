package Main.TextParser;
import Main.Enums.Directions;
import Main.Hero.Hero;
import Main.Texte.TextStorage;

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
    Pattern use_door = Pattern.compile(TextStorage.USE_DOOR);
    Pattern i_see = Pattern.compile(TextStorage.I_SEE);
    Pattern where_am_i = Pattern.compile(TextStorage.WHERE_AM_I);
    Pattern room = Pattern.compile(TextStorage.ROOM_DESCRIPTION);




    public void evaluate(String command){

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
        if(use_door.matcher(command).matches()){
            if(hero.getAktuellerRaum().getFocusedWall().getNextRoom() == null){
                System.out.println(TextStorage.NO_DOOR_HERE);
            }else{
                hero.changeRoom();
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
            System.out.println(TextStorage.ROOM_LOCATION + Colorlog.blue(hero.getAktuellerRaum().getRoomName()));
            System.out.println(Colorlog.white(TextStorage.VIEW) + Colorlog.blue(hero.getAktuellerRaum().getFocusedWall().getWallName()));
        }



    }






}
