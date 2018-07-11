package Main;

import Main.Hero.Hero;
import Main.Rooms.AllLevels;
import Main.TextParser.InputParser;
import Main.Texte.TextStorage;

import java.util.Scanner;

import static Main.Rooms.AllLevels.gti;
import static Main.Rooms.AllLevels.linalg;
import static Main.Rooms.AllLevels.statistik;

public class PlayMe {

    public static void main(String[] args) {

        // Erstellen der benötigten Instanzen
        boolean game_not_completed = true;
        Hero chris = new Hero(AllLevels.bahnhof);
        InputParser parser = new InputParser(chris);
        Scanner scanner = new Scanner(System.in);

        /**
         * Prolog des Spieles*/
        System.out.println(TextStorage.PROLOG);

        /**
         * In diesem Loop läuft das spiel
         */
        while (game_not_completed){
            System.out.println();
            String word = scanner.nextLine();
            System.out.println("Das eingegebene Wort war: " + word);
            parser.evaluate(word);


            //check if hero has all items
            if(chris.getInventar().contains(linalg)&&chris.getInventar().contains(statistik)&&chris.getInventar().contains(gti)){
                System.out.println(TextStorage.EPILOG);
                game_not_completed = false;
            }

            System.out.println();
        }
    }

}
