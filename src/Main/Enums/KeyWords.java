package Main.Enums;

public enum KeyWords {

    INSPECT, GO, HELP, TAKE, OPEN, TALK, LOOK, USE, PUT;
    // Write enums here

    /***
     * Keywords und Syntax für Interaktion mit Raum
     *
     * INSPECT <DIRECTION>|<Wall>|<Kiste>             --> Verwenden für Räume, Wände
     * GO <DIRECTION>                                 --> Verwenden für Räume  sollte Raum Wechseln
     * HELP [<WALLNAME>|<DIRECTION>|<Kiste>]          --> Verwenden für allgemeine Hilfe, oder für Hilfe zu Objekten oder Richtungen
     * LOOK <Direction>                               --> Verwenden für Raum
     * TAKE <genericObject>                           --> Verwenden für Objekte im Raum oder Objekte in Kisten
     * USE <inventarObject> for                       -->
     * PUT <genericObject> in <Kiste>
     *
     */



    // Interaktion mit Wänden

    // Interaktion mit Kisten

}
