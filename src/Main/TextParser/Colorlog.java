/**
 * Die Klasse Colorlog erlaubt es Texte farbig wiederzugeben. Somit ist das Storytelling einfacher nachzuvollziehen.
 * Alle funktionen sind statisch, da das Objekt nur zum loggen verwendet wird.
 *
 */
package Main.TextParser;


public final class Colorlog {

    /** ANSI Farbcodes
     * */
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";



    //Console Output in grün
    public static String green(String text){
        return ANSI_GREEN + text +ANSI_GREEN;
    }

    //Console Output in rot
    public static String red(String warning){
        return ANSI_RED + warning + ANSI_RED;
    }

    //Console Output in weiss
    public static String white(String text){
        return ANSI_WHITE + text + ANSI_WHITE;
    }

    //Console Output in gelb
    public static String yellow(String text){
        return ANSI_YELLOW + text + ANSI_YELLOW;
    }

    //Console Output in blau
    public static String blue(String text){
        return ANSI_BLUE + text + ANSI_BLUE;
    }

    //Console Output in violet
    public static String purple(String text){
        return ANSI_PURPLE + text + ANSI_PURPLE;
    }

    //Console Output in Cyan
    public static String cyan(String text){
        return ANSI_CYAN+ text + ANSI_CYAN ;}

}



/**
 * Quelle für die Farbcodes : https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
 * */