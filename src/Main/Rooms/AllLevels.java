package Main.Rooms;

import Main.Enums.RoomName;
import Main.Items.Kiste;
import Main.Items.genericItem;
import Main.Rooms.BuildingBlocks.Room;
import Main.Rooms.BuildingBlocks.Wall;
import Main.Texte.TextStorage;

import java.util.ArrayList;
import java.util.Arrays;

public class AllLevels {

    /**
     * ###############
     * #  OBJEKTE    #
     * ###############*/
    public static genericItem linalg = new genericItem(TextStorage.ITEM_NAME_LINALG,TextStorage.ITEM_PURPOSE_LINALG);
    public static genericItem statistik = new genericItem(TextStorage.ITEM_NAME_STATISTIK,TextStorage.ITEM_DESCRIPTION_STATISTIK);
    public static genericItem gti  = new genericItem(TextStorage.ITEM_NAME_GTI,TextStorage.ITEM_DESCRIPTION_GTI);

    /**
     * ###############
     * #  Kisten    #
     * ###############*/
    private static Kiste wurstMoritz = new Kiste(TextStorage.WALL_NAME_WURST_MORITZ,TextStorage.WALL_DESCRIPTION_WURST_MORITZ,TextStorage.WALL_OPEN_MESSAGE_WURST_MORITZ,TextStorage.WALL_EMPTY_MESSAGE_WURST_MORITZ,linalg, TextStorage.WALL_DENY_MESSAGE_WURST_MORITZ,TextStorage.wurstCode);
    private static Kiste handtuchSpender = new Kiste(TextStorage.BOX_NAME_HANDTUCH,TextStorage.BOX_DESCRIPTION_HANDTUCH,TextStorage.BOX_OPEN_MESSAGE,TextStorage.BOX_EMPTY_MESSAGE,statistik);
    private static Kiste pult = new Kiste(TextStorage.EAST_WALL_NAME_STUDY_ROOM,TextStorage.BOX_DESCRIPTION_PULT,TextStorage.BOX_OPEN_MESSAGE_PULT,TextStorage.BOX_EMPTY_MESSAGE_PULT,gti);

    /**
     * ###############
     * #    Räume    #
     * ###############*/
    //------------------------------------------- Bahnhof ----------------------------------------------------------------------------
    private static Wall nordWand_Bahnhof = new Wall(TextStorage.WALL_NAME_PLATFORM,TextStorage.WALL_DESCRIPTION_PLATFORM);
    private static Wall ostWand_Bahnhof = new Wall(TextStorage.WALL_NAME_ESCALATOR,TextStorage.WALL_DESCRIPTION_ESCALATOR,RoomName.WELLE);
    private static Wall suedWand_Bahnhof = new Wall(TextStorage.WALL_NAME_PLATFORM,TextStorage.WALL_DESCRIPTION_PLATFORM);
    private static Wall westWand_Bahnhof = new Wall(TextStorage.WALL_NAME_DEAD_END,TextStorage.WALL_DESCRIPTION_DEAD_END);

    public static Room bahnhof = new Room(nordWand_Bahnhof,ostWand_Bahnhof,suedWand_Bahnhof,westWand_Bahnhof,TextStorage.ROOM_NAME_PLATFORM,RoomName.BHF);


    //------------------------------------------- Welle 7 ----------------------------------------------------------------------------
    private static Wall nordWand_Welle7 = new Wall(TextStorage.WALL_NAME_GITTIG,TextStorage.WALL_DESCRIPTION_GITTTIG);
    private static Wall ostWand_Welle7 =  new Wall(TextStorage.WEST_WALL_NAME_SECOND_FLOOR,TextStorage.DOOR_DESCRIPTION_STAIRS_EG_GANG,RoomName.ETAGE1);
    private static Wall suedWand_Welle7 = new Wall(TextStorage.WALL_NAME_WURST_MORITZ,TextStorage.WALL_DESCRIPTION_WURST_MORITZ,wurstMoritz);
    private static Wall westWand_Welle7 = new Wall(TextStorage.WALL_NAME_ESCALATOR,TextStorage.WALL_DESCRIPTION_ESCALATOR_REVERSE, RoomName.BHF);

    public static Room welle7 = new Room(nordWand_Welle7,ostWand_Welle7,suedWand_Welle7,westWand_Welle7,TextStorage.ROOM_NAME_WELLE7,RoomName.WELLE);


    //--------------------------------------------- WC  ----------------------------------------------------------------------------

    private static Wall nordWand_WC = new Wall(TextStorage.WALL_NAME_WC,TextStorage.WALL_DESCRIPTION_WC);
    private static Wall ostWand_WC = new Wall(TextStorage.WALL_NAME_SINK,TextStorage.WALL_DESCRIPTION_SINK,handtuchSpender);
    private static Wall suedWand_WC = new Wall(TextStorage.WALL_NAME_WC_EXIT,TextStorage.WALL_DESCRIPTION_WC_EXIT,RoomName.ETAGE1);
    private static Wall westWand_WC = new Wall(TextStorage.WALL_NAME_WINDOW,TextStorage.WALL_DESCRIPTION_WINDOW);

    public static Room wc = new Room(nordWand_WC,ostWand_WC,suedWand_WC,westWand_WC,TextStorage.ROOM_NAME_WC,RoomName.WC);

    //--------------------------------------------- Etage1  ----------------------------------------------------------------------------
    private static Wall nordWand_Etage1 = new Wall(TextStorage.NORTH_WALL_NAME_FIRST_FLOOR,TextStorage.NORTH_WALL_DESCRIPTION_FIRST_FLOOR,RoomName.WC);
    private static Wall ostWand_Etage1 = new Wall(TextStorage.WALL_NAME_STAIRS,TextStorage.EAST_WALL_DESCRIPTION_FIRST_FLOOR,RoomName.ETAGE2);
    private static Wall suedWand_Etage1 = new Wall(TextStorage.SOUTH_WALL_NAME_FIRST_FLOOR, TextStorage.SOUTH_WALL_DESCRIPTION_FIRST_FLOOR);
    private static Wall westWand_Etage1 = new Wall(TextStorage.WALL_NAME_STAIRS,TextStorage.WEST_WALL_DESCRIPTION_FIRST_FLOOR,RoomName.WELLE);

    public static Room etage1 = new Room(nordWand_Etage1, ostWand_Etage1, suedWand_Etage1, westWand_Etage1,TextStorage.ROOM_NAME_GANG1,RoomName.ETAGE1);


    //--------------------------------------------- Etage 2  ----------------------------------------------------------------------------
    private static Wall nordWand_Etage2 = new Wall(TextStorage.NORTH_WALL_NAME_SECOND_FLOOR, TextStorage.NORTH_WALL_DESCRIPTION_SECOND_FLOOR, RoomName.UNTERRICHTSRAUM);
    private static Wall ostWand_Etage2 = new Wall(TextStorage.EAST_WALL_NAME_SECOND_FLOOR, TextStorage.EAST_WALL_DESCRIPTION_SECOND_FLOOR,RoomName.OBERE_ETAGE);
    private static Wall suedWand_Etage2 = new Wall(TextStorage.SOUTH_WALL_NAME_SECOND_FLOOR,TextStorage.SOUTH_WALL_DESCRIPTION_SECOND_FLOOR);
    private static Wall westWand_Etage2 = new Wall(TextStorage.WEST_WALL_NAME_SECOND_FLOOR,TextStorage.WEST_WALL_DESCRIPTION_SECOND_FLOOR,RoomName.ETAGE1);

    public static Room etage2 = new Room(nordWand_Etage2,ostWand_Etage2,suedWand_Etage2,westWand_Etage2,TextStorage.ROOM_NAME_2FLOOR,RoomName.ETAGE2);

    //--------------------------------------------- Studienraum ----------------------------------------------------------------------------
    private static Wall nordWand_Studienraum = new Wall(TextStorage.NORTH_WALL_NAME_STUDY_ROOM,TextStorage.NORTH_WALL_DESCRIPTION_STUDY_ROOM);
    private static Wall ostWand_Studienraum = new Wall(TextStorage.EAST_WALL_NAME_STUDY_ROOM,TextStorage.EAST_WALL_DESCRIPTION_STUDY_ROOM,pult);
    private static Wall suedWand_Studienraum = new Wall(TextStorage.SOUTH_WALL_NAME_STUDY_ROOM,TextStorage.SOUTH_WALL_DESCRIPTION_STUDY_ROOM,RoomName.ETAGE2);
    private static Wall westWand_Studienraum = new Wall(TextStorage.WEST_WALL_NAME_STUDY_ROOM,TextStorage.WEST_WALL_DESCRIPTION_STUDY_ROOM);

    public static Room studienraum = new Room(nordWand_Studienraum,ostWand_Studienraum,suedWand_Studienraum,westWand_Studienraum,TextStorage.ROOM_NAME_STUDIENRAUM,RoomName.UNTERRICHTSRAUM);


    //--------------------------------------------- Obere Etage ----------------------------------------------------------------------------
    private static Wall nordWand_ObereEtage = new Wall(TextStorage.NORTH_WALL_NAME_UPPER_FLOOR,TextStorage.NORTH_WALL_DESCRIPTION_UPPER_FLOOR);
    private static Wall westWand_ObereEtage = new Wall(TextStorage.EAST_WALL_NAME_UPPER_FLOOR,TextStorage.EAST_WALL_DESCRIPTION_UPPER_FLOOR,RoomName.ETAGE2);
    private static Wall suedWand_ObereEtage = new Wall(TextStorage.SOUTH_WALL_NAME_UPPER_FLOOR,TextStorage.SOUTH_WALL_DESCRIPTION_UPPER_FLOOR);
    private static Wall ostWand_ObereEtage = new Wall(TextStorage.WEST_WALL_NAME_UPPER_FLOOR,TextStorage.WEST_WALL_DESCRIPTION_UPPER_FLOOR,RoomName.OFFICE);

    public static Room obereEtage = new Room(nordWand_ObereEtage,ostWand_ObereEtage,suedWand_ObereEtage,westWand_ObereEtage,TextStorage.ROOM_NAME_3FLOOR,RoomName.OBERE_ETAGE);

    //--------------------------------------------- Büro FFHS  ----------------------------------------------------------------------------
    private static Wall nordWand_Office = new Wall(TextStorage.NORTH_WALL_NAME_BUREAU,TextStorage.NORTH_WALL_DESCRIPTION_BUREAU,RoomName.OBERE_ETAGE);
    private static Wall ostWand_Office = new Wall(TextStorage.EAST_WALL_NAME_BUREAU,TextStorage.EAST_WALL_DESCRIPTION_BUREAU);
    private static Wall suedWand_Office= new Wall(TextStorage.SOUTH_WALL_NAME_BUREAU, TextStorage.SOUTH_WALL_DESCRIPTION_BUREAU);
    private static Wall westWand_Office = new Wall(TextStorage.WEST_WALL_NAME_BUREAU,TextStorage.WEST_WALL_DESCRIPTION_BUREAU);

    public static Room office = new Room(nordWand_Office,ostWand_Office,suedWand_Office,westWand_Office,TextStorage.ROOM_NAME_OFFICE,RoomName.OFFICE);


    /**
     * #######################################
     * #  Öffentliche Arraylist der Räume    #
     * #######################################*/

    public static ArrayList<Room> AllRooms = new ArrayList<>(Arrays.asList(bahnhof, welle7,wc,etage1,etage2,studienraum,obereEtage,office));
}
