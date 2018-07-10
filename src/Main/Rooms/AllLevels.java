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
    private static genericItem linalg = new genericItem(TextStorage.ITEM_NAME_LINALG,TextStorage.ITEM_PURPOSE_LINALG);


    /**
     * ###############
     * #  Kisten    #
     * ###############*/
    private static Kiste wurstMoritz = new Kiste(TextStorage.WALL_NAME_WURST_MORITZ,TextStorage.WALL_DESCRIPTION_WURST_MORITZ,TextStorage.WALL_OPEN_MESSAGE_WURST_MORITZ,TextStorage.WALL_EMPTY_MESSAGE_WURST_MORITZ,linalg, TextStorage.TEST_DENY_BOX_ACCESS,TextStorage.wurstCode);



    /**
     * ###############
     * #    Räume    #
     * ###############*/
    //------------------------------------------- Bahnhof ----------------------------------------------------------------------------
    private static Wall nordWand_Bahnhof = new Wall(TextStorage.WALL_NAME_PLATFORM,TextStorage.WALL_DESCRIPTION_PLATFORM);
    private static Wall suedWand_Bahnhof = new Wall(TextStorage.WALL_NAME_PLATFORM,TextStorage.WALL_DESCRIPTION_PLATFORM);
    private static Wall ostWand_Bahnhof = new Wall();
    private static Wall westWand_Bahnhof = new Wall(TextStorage.WALL_NAME_DEAD_END,TextStorage.WALL_DESCRIPTION_DEAD_END);

    public static Room bahnhof = new Room(nordWand_Bahnhof,suedWand_Bahnhof,ostWand_Bahnhof,westWand_Bahnhof,TextStorage.ROOM_NAME_PLATFORM,RoomName.BHF);



    //------------------------------------------- Welle 7 ----------------------------------------------------------------------------
    private static Wall nordWand_Welle7 = new Wall(TextStorage.WALL_NAME_GITTIG,TextStorage.WALL_DESCRIPTION_GITTTIG);
    private static Wall suedWand_Welle7 = new Wall(TextStorage.WALL_NAME_WURST_MORITZ,TextStorage.WALL_DESCRIPTION_WURST_MORITZ,wurstMoritz);
    private static Wall ostWand_Welle7 =  new Wall(TextStorage.WALL_NAME_PLATFORM,TextStorage.WALL_DESCRIPTION_PLATFORM);
    private static Wall westWand_Welle7 = new Wall(TextStorage.WALL_NAME_ESCALATOR,TextStorage.WALL_DESCRIPTION_ESCALATOR_REVERSE);

    public static Room welle7 = new Room(nordWand_Welle7,suedWand_Welle7,ostWand_Welle7,westWand_Welle7,TextStorage.ROOM_NAME_WELLE7,RoomName.WELLE);



    //--------------------------------------------- WC  ----------------------------------------------------------------------------

    public static ArrayList<Room> AllRooms = new ArrayList<>(Arrays.asList(welle7,bahnhof));





    //
}
