package Main;

import Main.Graphics.Graphics;
import Main.Hero.Hero;
import Main.Rooms.AllLevels;
import Main.TextParser.InputParser;
import Main.Texte.TextStorage;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Main.Rooms.AllLevels.gti;
import static Main.Rooms.AllLevels.linalg;
import static Main.Rooms.AllLevels.statistik;

public class PlayMe {

    public static void main(String[] args) throws FileNotFoundException {

        // Erstellen der benötigten Instanzen
        boolean game_not_completed = true;
        Hero chris = new Hero(AllLevels.bahnhof);
        InputParser parser = new InputParser(chris);
        Scanner scanner = new Scanner(System.in);
        String basePath = new File("").getAbsolutePath();

        /**
         * Prolog des Spieles*/
        Graphics.titleScreen();
        InputParser.fileReader(basePath.concat("/src/Main/Texte/Prolog.txt"));

        /**
         * In diesem Loop läuft das spiel
         */
        while (game_not_completed){
            String word = scanner.nextLine();
            parser.evaluate(word);



            //Beende das Spiel, wenn alle Prüfungen gefunden wurden und du dich im Büro befindest
            if(chris.getInventar().contains(linalg)&&chris.getInventar().contains(statistik)&&chris.getInventar().contains(gti)&&chris.getAktuellerRaum()== AllLevels.office){
                InputParser.fileReader(basePath.concat("/src/Main/Texte/Epilog.txt"));
                game_not_completed = false;
            }

            // Ein wenig mehr Abstand
            System.out.println();
        }
    }

}
