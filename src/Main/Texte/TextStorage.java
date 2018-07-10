package Main.Texte;

public final class TextStorage {

    //MISC
    public static final String LINE_FILLER = "*** ";
    public static final String LINEBREAK = " \n";
    public static final String RIGHTARROW = "---> ";
    public static final String OOPS = "Oops! Da ist etwas fehlgeschlagen!";
    public static int  wurstCode= 10;

    //ITEMS
    public static final String ITEM_PURPOSE = "Hmmm ich weiss nicht, wozu ich diesen Gegenstand verwenden kann.";

    //INVENTORY
    public static final String EMPTY_INVENTORY = "Es befindet sich nicht in deinem Inventar!";
    public static final String INVENTORY_START_MESSAGE = "Dein Inventar besteht aus: \n";
    public static final String INVENTORY_DESCRIPTION = "Beschreibung: ";

    //BOX
    public static final String BOX_OPENING = "Wow! Der Code wurde geknackt und die Kiste ist nun offen!";
    public static final String BOX_LOCKED = "Leider stimmt der Code nicht!";
    public static final String GET_ITEM_START = "*** Gratulation ";
    public static final String GET_ITEM_END = "  wurde deinem Inventar hinzugefügt*** ";

    //ROOM
    public static final String ROOM_LOCATION = "Du befindest dich im Raum: ";
    public static final String ROOM_INSPECTION_NOTATION = "Nach einer kurzen Inspektion notierst du: \n";

    //DIRECTIONS
    public static final String DIRECTION_NORTH = "Im Norden: \n";
    public static final String DIRECTION_EAST = "Im Osten: \n";
    public static final String DIRECTION_SOUTH = "Im Süden: \n";
    public static final String DIRECTION_WEST = "Im Westen: \n";

    //WALL
    public static final String WALL_DESCRIPTION_START = "Hier befindet sich eine Tür, welche dich ";
    public static final String WALL_DESCRIPTION_END = " führt.";
    public static final String WALL_DOOR_TO_DIRECTION = "Hier befindet sich eine Tür nach: ";
    public static final String WALL_EMPTY = "An dieser Wand befindet sich nichts.";
    public static final String WALL_INSPECTION_START = "An dieser Wand befindet sich: ";
    public static final String WALL_INSPECTION_EMPTY = "Es gibt hier keinen Gegenstand.";

    //HERO
    public static final String INTERRUPT_EXCEPTION_WARNING = "Oops! Da gab es eine InterruptException!";
    public static final String TAKE_DAMAGE = "*Seufz* - Mein Frustrationslevel steigt...";
    public static final String GAME_OVER = "Du hast keine Lust mehr und gibst auf... Das Spiel ist vorbei und du gehst nach Hause.";


    //--------------------- Rooms ---------------------------------------

    // Bahnhof Bern
    public static final String ROOM_NAME_PLATFORM = "Bahnhof Bern";
    public static final String WALL_NAME_PLATFORM ="Gleise";
    public static final String WALL_DESCRIPTION_PLATFORM="Du siehst die Gleise nahe bei deinen Füssen, Abstand denkst du dir und entfernst dich wieder von dem Gleis";
    public static final String WALL_NAME_DEAD_END="Kein Durchgang";
    public static final String WALL_DESCRIPTION_DEAD_END="Dieser Weg führt dich nicht zum Ziel! Wir müssen herausfinden, wo die Prüfungen sind! Auf auf ins Abenteuer";
    public static final String WALL_NAME_ESCALATOR = "Rolltreppe" ;
    public static final String WALL_DESCRIPTION_ESCALATOR = "Du siehst wie die Rollteppe Stufe für Stufe in Richtung Welle 7 hochsteigt. Dieser Weg führt in Richtung FFHS";

    // Erdgeschoss
    public static final String ROOM_NAME_EG = "Erdgeschoss";
    public static final String WALL_NAME_GITTIG ="Gittig"  ;
    public static final String WALL_DESCRIPTION_GITTTIG = "Ach herje.... wie schön Sie zu sehen! Mir ist etwas unglaubiches Passiert. Als ich rasch im Wurst und Moritz meine gratis Wurst holen wollten mit meinen 10 Stempel auf der Stempelkarte"+
      " entwendete jemand die Prüfungen aus meinem Büro. Alle Prüfungen sind Weg!!!! \n"+
      "Keine Linearen Algebraprüfungen, keine Statistikprüfungen und keine GTIprüfungen mehr. Kannst du mir helfen diese zu finden? Falls du was findest, kannst du sie mir im Büro der FFHS abgeben." +
      " Ansonsten müssen alle die Prüfungen nachholen. Und sind wütend auf mich.";
    public static final String WALL_NAME_WURST_MORITZ = "Wurst und Moritz";
    public static final String WALL_DESCRIPTION_WURST_MORITZ = "Du siehst das breite Grinsen des Wurstverkäufers. Es läuft dir das Wasser im Mund zusammen, wenn du diese deftigen Würste siehst... Ich wache wieder aus meinen Gedanken auf" +
      " und versuche mich auf mein eigentliches Ziel zu konzentrieren. Die Prüfungen muss ich wiederfinden.";
    public static final String WALL_OPEN_MESSAGE_WURST_MORITZ = " Du scheinst ein Wahrer Kunde zu sein! Hier hast du den Stapel von Linalg Prüfungen, die ich gefunden habe";
    public static final String WALL_EMPTY_MESSAGE_WURST_MORITZ =" Du hast die Prüfungen bereits geholt. Mehr kann ich dir nicht geben!";
    public static final String WALL_DENY_MESSAGE_WURST_MORITZ = " Schade, dass du nichteinmal dass weisst... Du bist leider nicht so ein treuer Kunde wie Gittig. Ich bin zu tiefst entäuscht";
    public static final String ITEM_NAME_LINALG = "Lineare Algebra Prüfungen";
    public static final String ITEM_PURPOSE_LINALG = "Ein Stapel von Linalg Prüfungen. Leider sieht es so aus, als ob du nicht bestanden hättest";
    public static final String ITEM_LOCK_MESSAGE_LINALG = "Endlich bist du wieder hier, ich dachte meinen treusten Kunden bereits verloren zu haben. Ich habe ein Geschenk für dich! \n" +
      "Doch zuerst must du mir beantworten wie viele Stempel es benötigt um eine Sammelkarte zu füllen";

    public static final String WALL_DESCRIPTION_ESCALATOR_REVERSE = "Von der Welle 7 aus kannst du die Gleise sehen, welche dich zurück zum Bahnhof führen. Doch dort wirst du wahrscheinlich nichts finden.";
    public static final String DOOR_DESCRIPTION_STAIRS_EG_GANG = "Neben den modernen Liften der Welle 7, deren Funktionsweise dir bis heute ein Rätsel ist, siehst du das Treppenhaus welches dich in die 1. Etage führen kann";



    // Erste Etage
    public static final String ROOM_NAME_WELLE7 = "Welle 7";
    public static final String EAST_WALL_NAME_FIRST_FLOOR = "Treppe";
    public static final String EAST_WALL_DESCRIPTION_FIRST_FLOOR = "Schonwieder Treppen! Diese führen dich zur zweiten Etage.";
    public static final String WEST_WALL_NAME_FIRST_FLOOR = "Treppe";
    public static final String WEST_WALL_DESCRIPTION_FIRST_FLOOR = "Die Treppen hinunter befindet sich das Erdgeschoss mit den vielen Essensständen der Welle 7.";
    public static final String SOUTH_WALL_NAME_FIRST_FLOOR = "Lounge";
    public static final String SOUTH_WALL_DESCRIPTION_FIRST_FLOOR = "Ausgefallene Möbel. Das muss wohl eine der vielen Lounges von diesem Gebäude sein!";
    public static final String NORTH_WALL_NAME_FIRST_FLOOR = "Tür";
    public static final String NORTH_WALL_DESCRIPTION_FIRST_FLOOR = "Über der Tür hängt ein WC-Schild. Anscheinend befinden sich hier die topmodernen Toiletten der FFHS.";

    // WC
    public static final String ROOM_NAME_WC = "Toiletten";
    public static final String WALL_NAME_WINDOW = "Fenster";
    public static final String WALL_DESCRIPTION_WINDOW = "Aus den Fenstern des WC's kannst du nicht viel sehen. Was hast du erwartet.";
    public static final String WALL_NAME_WC = "Toiletten";
    public static final String WALL_DESCRIPTION_WC = "Du schaust das WC an, welches wie aus Zauberhand die Spülung betätigt. Diese Funktionalität scheint wohl ein Bad Smell zu sein, denkst du dir.";
    public static final String WALL_NAME_SINK="Waschbecken";
    public static final String WALL_DESCRIPTION_SINK="Dieses Waschbecken sieht ganz normal aus.... Doch warte einmal! Es scheinen einige Blätter daneben auf dem Boden zu liegen!";
    public static final String ITEM_NAME_STATISTIK = "Statistik";
    public static final String ITEM_DESCRIPTION_STATISTIK ="Ein Stapel von Statistikprüfungen... Anscheinend warst du in dieser Prüfung nicht schlecht, doch deine 4.5 reicht nicht aus um deine schlechte Vornote zu kompensieren";


    // Zweite Etage
    public static final String ROOM_NAME_2FLOOR = "2. Etage";
    public static final String EAST_WALL_NAME_SECOND_FLOOR = "Tür";
    public static final String EAST_WALL_DESCRIPTION_SECOND_FLOOR = "Du siehst den Lift, welchen dich zur Oberen Etage bringt.";
    public static final String WEST_WALL_NAME_SECOND_FLOOR = "Treppe";
    public static final String WEST_WALL_DESCRIPTION_SECOND_FLOOR = "Du schaust die Treppen hinunter und siehst die erste Etage.";
    public static final String SOUTH_WALL_NAME_SECOND_FLOOR = "Wand";
    public static final String SOUTH_WALL_DESCRIPTION_SECOND_FLOOR = "An der Wand hängt ein Bildschirm mit dem Unterrichtsplan der FFHS.";
    public static final String NORTH_WALL_NAME_SECOND_FLOOR = "Tür";
    public static final String NORTH_WALL_DESCRIPTION_SECOND_FLOOR = "Durch die Glastür hindurch siehst du den Studienraum mit dem üblichen Möbelierungsstandard der FFHS.";

    //Studienraum
    public static final String ROOM_NAME_STUDIENRAUM = "Unterrichtsraum";
    public static final String ITEM_NAME_GTI = "Grundlagen Technische Informatik Prüfung (GTI)";
    public static final String ITEM_PURPOSE_GTI = "Ein riesen Stapel Prüfungen. Mist! Du hast diese Prüfung vergeigt und nicht bestanden!";
    public static final String ITEM_UNLOCK_GTI = "Du entnimmst den Stapel GTI Prüfungen aus dem Pult.";

    public static final String EAST_WALL_NAME_STUDY_ROOM = "Pult";
    public static final String EAST_WALL_DESCRIPTION_STUDY_ROOM = "Du schaust auf ein Pult, welches eine Schublade hat. Vielleicht befindet sich etwas darin.";
    public static final String WEST_WALL_NAME_STUDY_ROOM = "Whiteboard";
    public static final String WEST_WALL_DESCRIPTION_STUDY_ROOM = "An der Wand hängt ein Whiteboard. Wahrscheinlich wird in diesem Raum unterrichtet.";
    public static final String SOUTH_WALL_NAME_STUDY_ROOM = "Tür";
    public static final String SOUTH_WALL_DESCRIPTION_STUDY_ROOM = "Durch die Glastür hindurch siehst du die zweite Etage.";
    public static final String NORTH_WALL_NAME_STUDY_ROOM = "Kaffeeautomat";
    public static final String NORTH_WALL_DESCRIPTION_STUDY_ROOM = "Ich wünschte der Kaffeautomat würde funktionieren. Leider ist dieser eher zur dekoration im Raum.";

    //Obere Etage
    public static final String ROOM_NAME_3FLOOR = "3.Etage";
    public static final String EAST_WALL_NAME_UPPER_FLOOR = "Tür";
    public static final String EAST_WALL_DESCRIPTION_UPPER_FLOOR = "Du siehst den Lift, welchen dich zur zweiten Etage bringt.";
    public static final String WEST_WALL_NAME_UPPER_FLOOR = "Tür";
    public static final String WEST_WALL_DESCRIPTION_UPPER_FLOOR = "Du schaust durch die Tür und siehst Herrn Gittigs Büro.";
    public static final String SOUTH_WALL_NAME_UPPER_FLOOR = "Wand";
    public static final String SOUTH_WALL_DESCRIPTION_UPPER_FLOOR = "An der Wand hängt das FFHS Plakat mit der Aufschrift: Studieren wann Sie wollen, wo Sie wollen und wie Sie wollen. Hmmm... Akkurat.";
    public static final String NORTH_WALL_NAME_UPPER_FLOOR = "Fenster";
    public static final String NORTH_WALL_DESCRIPTION_UPPER_FLOOR = "Du schaust aus dem Fenster und siehst in den Hinterhof der FFHS.";

    //Büro FFHS
    public static final String ROOM_NAME_OFFICE = "Büro der FFHS";
    public static final String ALL_EXAMS_IN_INVENTORY_TRUE = "Ah super! Vielen Dank, ich hatte schon Angst wir müssen die Prüfungen wiederholen. Wie ich sehe hast du aber leider nicht bestanden.";
    public static final String ALL_EXAMS_IN_INVENTORY_FALSE = "Dir fehlen aber noch ein paar Prüfungen. Ich brauche alle, sonst müssen wir die Prüfungen wiederholen.";

    public static final String EAST_WALL_NAME_BUREAU = "Wand";
    public static final String EAST_WALL_DESCRIPTION_BUREAU = "An der Wand hängen ein paar Bilder und Auszeichnungen von Herrn Gittig. Interessant!";
    public static final String WEST_WALL_NAME_BUREAU = "Fenster";
    public static final String WEST_WALL_DESCRIPTION_BUREAU = "Du schaust aus dem Fenster und siehst die Gleise vom Bahnhof Bern. Nichts besonderes.";
    public static final String SOUTH_WALL_NAME_BUREAU = "Herr Gittig";
    public static final String SOUTH_WALL_DESCRIPTION_BUREAU = "Da steht ja Herr Gittig. Er scheint gestresst zu sein.";
    public static final String NORTH_WALL_NAME_BUREAU = "Tür";
    public static final String NORTH_WALL_DESCRIPTION_BUREAU = "Du schaust durch die Tür und siehst die obere Etage.";



    //----------------------------------- Testing ------------------------------------------
    public static final String TEST_WALL_DESCRIPTION = "Herzlich willkommen bei Wurst und Moritz Ich habe ein Geschenk für sie wollen sie es öffnen?";
    public static final String TEST_WALL_NAME = "Wurst und Moritz";
    public static final String TEST_ITEM_NAME ="Linalg Prüfungen";
    public static final String TEST_ITEM_DESCRIPTION ="Leider nicht bestanden";
    public static final String TEST_BOX_NAME = "Pult";
    public static final String TEST_UNLOCKED_BOX_DESCRIPTION = "Diese Truhe scheint nicht verschlossen zu sein";
    public static final String TEST_LOCED_BOX_DESCRIPTION = "Diese Truhe schein verschlossen zu sein";
    public static final String TEST_OPEN_MESSAGE = "Die Kiste wurde geöffnet";
    public static final String TEST_DENY_BOX_ACCESS = " UUppps, die Kiste scheint verschlossen zu sein. Kannst du sie öffnen?";
    public static final String TEST_EMPTY_MESSAGE = "Du hast die Kiste bereits geleert. Mehr gibts nicht";

}
