/**
 * Testklasse für die Colorlogklasse
 */

package Test.TextParser;
import Main.TextParser.Colorlog;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColorlogTest {

    @Test
    public void evaluatesExpression() {

        //Evaluation der einzelnen Farbfunktionen
        Colorlog colorlog = new Colorlog();
        System.out.println(colorlog.green("Dieser Text sollte grün sein => Verwenden für Upgrades und positives"));
        System.out.println(colorlog.red("Dieser Text sollte rot sein => verwenden für Warnungen"));
        System.out.println(colorlog.white("Dieser Text sollte weiss sein => Verwenden für regulären Text"));
        System.out.println(colorlog.yellow("Dieser Text sollte gelb sein => Noch kein Zweck"));
        System.out.println(colorlog.purple("Dieser Test sollte in violett sein => Noch keinen Zweck"));
        System.out.println(colorlog.cyan("Dieser Text sollte in cyan sein => Noch keinen Zweck"));
        System.out.println(colorlog.blue("Dieser Text sollte in blau sein => Noch keinen Zweck"));

    }

}
