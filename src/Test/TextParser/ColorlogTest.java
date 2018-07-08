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
        colorlog.green("Dieser Text sollte grün sein => Verwenden für Upgrades und positives");
        colorlog.red("Dieser Text sollte rot sein => verwenden für Warnungen");
        colorlog.white("Dieser Text sollte weiss sein => Verwenden für regulären Text");
        colorlog.yellow("Dieser Text sollte gelb sein => Noch kein Zweck");
        colorlog.purple("Dieser Test sollte in violett sein => Noch keinen Zweck");
        colorlog.cyan("Dieser Text sollte in cyan sein => Noch keinen Zweck");
        colorlog.blue("Dieser Text sollte in blau sein => Noch keinen Zweck");
    }

}
