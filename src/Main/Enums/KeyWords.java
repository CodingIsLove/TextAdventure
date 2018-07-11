package Main.Enums;

public enum KeyWords {

    INSPECT, GO, HELP, TAKE, OPEN, TALK, LOOK, USE, PUT;

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

}
