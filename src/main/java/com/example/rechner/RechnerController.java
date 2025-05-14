package com.example.rechner;

import com.example.rechner.StratOperatoren.*; //alles hier im package importieren
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class RechnerController {
    private IOperatoren operatorenStrat;
    double ersteZahl = 0;
    boolean neueEingabe = true; // ob neue eingabe gemacht worden ist oder nicht

    //ausgabe
    @FXML
    protected Label ausgabe;

    @FXML
    protected void reset() {
        ausgabe.setText("");          // Anzeige leeren
        ersteZahl = 0;                // erste Zahl zurücksetzen
        neueEingabe = true;           // Eingabe beginnt neu
        System.out.println("Taschenrechner wurde zurückgesetzt.");
    }
    //Operatoren
    @FXML
    protected void plus() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operatorenStrat = new Add();
        neueEingabe = true; //--> user gibt neue Zahl ein
    }

    @FXML
    protected void minus() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operatorenStrat = new Sub();
        neueEingabe = true;
    }

    @FXML
    protected void times() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operatorenStrat = new Times();
        neueEingabe = true;
    }

    @FXML
    protected void devide() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operatorenStrat = new Div();
        neueEingabe = true;
    }

    @FXML
    protected void percent() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operatorenStrat = new Percent();
        neueEingabe = true;
    }
    @FXML
    public void equal() {
        try {
            double zweiteZahl = Double.parseDouble(ausgabe.getText());
            double ergebnis = operatorenStrat.calc(ersteZahl, zweiteZahl);

            // Formatierung: Komma statt Punkt, keine ".0" wenn nicht nötig
            DecimalFormatSymbols symb = new DecimalFormatSymbols(Locale.GERMAN); // für Komma
            DecimalFormat df = new DecimalFormat("#.##", symb); // keine unnötigen Nachkommastellen
            String formatiert = df.format(ergebnis);

            ausgabe.setText(formatiert);
            neueEingabe = true;
        } catch (Exception e) {
            ausgabe.setText("Fehler");
        }
    }
/** @ReplaceOldCode
 * :durch strategy-pattern weil es jetzt erweiterbar ist und ich es üben wollte
 *
    @FXML
    public void equal() {
        double zweiteZahl = Double.parseDouble(ausgabe.getText());
        double ergebnis = 0;

        switch (operator) {
            case "+":
                ergebnis = ersteZahl + zweiteZahl;
                break;
            case "-":
                ergebnis = ersteZahl - zweiteZahl;
                break;
            case "*":
                ergebnis = ersteZahl * zweiteZahl;
                break;
            case "/":
                if (zweiteZahl != 0) {
                    ergebnis = ersteZahl / zweiteZahl;
                } else {
                    ausgabe.setText("Fehler");
                    return;
                }
                break;
            default:
                break;
        }

        ausgabe.setText(String.valueOf(ergebnis));
        neueEingabe = true;
    }
 */
    //Ziffern
    @FXML
    protected void one() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu 1 +1 +1 +1
       ausgabe.setText(ausgabe.getText() + "1");
    }

    @FXML
    protected void two() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
        ausgabe.setText(ausgabe.getText() + "2");
    }

    @FXML
    protected void three() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
        ausgabe.setText(ausgabe.getText() + "3");
    }

    @FXML
    protected void four() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
        ausgabe.setText(ausgabe.getText() + "4");
    }

   @FXML
    protected void five() {
       if (neueEingabe) {
           ausgabe.setText("");
           neueEingabe = false;
       }
       // ausgabe.getText(); && text auslesen gettext + settext dazu
       ausgabe.setText(ausgabe.getText() + "5");

    }
    @FXML
    protected void six() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
        ausgabe.setText(ausgabe.getText() + "6");
    }

    @FXML
    protected void seven() {
        if (neueEingabe) {
            ausgabe.setText(""); //neue zahl
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
        ausgabe.setText(ausgabe.getText() + "7");;
    }

    @FXML
    protected void eight() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
        ausgabe.setText(ausgabe.getText() + "8");
    }

    @FXML
    protected void nine() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
        ausgabe.setText(ausgabe.getText() + "9");
    }

    @FXML
    protected void zero() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
        ausgabe.setText(ausgabe.getText() + "0");
    }


}