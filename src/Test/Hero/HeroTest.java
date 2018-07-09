package Test.Hero;

import Main.Enums.Directions;
import Main.Hero.Hero;
import Main.Items.Kiste;
import Main.Items.genericItem;
import Main.Rooms.Room;
import Main.Rooms.Wall;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {



    @Test
    public static void TestHero(){

        //Erstellen der Items, die verwendet werden

        // Erstellen des Erdgeschosses
        Wall nordwand_erdgeschoss = new Wall(); // Hier wäre eigentlich eine Türe nach Gang1
        Wall suedWand_erdgeschoss = new Wall("Herzlich willkommen bei Wurst und Moritz Ich habe ein Geschenk für sie wollen sie es öffnen?",new genericItem("Linalgprüfungen"),"Willkommen bei Wurst und Moritz",10 );
        Wall ostWand_erdgeschoss = new Wall();
        Wall westWand_erdgeschoss = new Wall();
        Room erdgeschoss = new Room(nordwand_erdgeschoss,suedWand_erdgeschoss,ostWand_erdgeschoss,westWand_erdgeschoss,Directions.NORTH,"Welle 7","Hier befindest du dich in der Welle 7");


        // Erstellen des Bahnhofes
        Wall nordWand = new Wall("Hier befinden sich die Gleise");
        Wall suedWand = new Wall("Hier befinden sich die Gleise");
        Wall ostWand = new Wall(erdgeschoss);
        Wall westWand = new Wall("Dead End: Du willst doch nicht einfach wieder nach Hause gehen!");
        Room welle7 = new Room(nordWand,suedWand,ostWand,westWand,Directions.NORTH,"Bahnhof","Du befindest dich hier am Bahnhof Bern");



        private Hero chris = new Hero("chris");



    }




}