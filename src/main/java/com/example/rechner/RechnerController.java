package com.example.rechner;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RechnerController {
    double ersteZahl = 0;
    private String operator = "";
    boolean neueEingabe = true;

    //ausgabe
    @FXML
    protected TextField ausgabe;

    @FXML
    protected void reset() {
        ausgabe.setText("");          // Anzeige leeren
        ersteZahl = 0;                // erste Zahl zurücksetzen
        operator = "";                // Operator leeren
        neueEingabe = true;           // Eingabe beginnt neu
        System.out.println("Taschenrechner wurde zurückgesetzt.");
    }
    //Operatoren
    @FXML
    protected void plus() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operator = "+";
        neueEingabe = true;
    }

    @FXML
    protected void minus() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operator = "-";
        neueEingabe = true;
    }

    @FXML
    protected void times() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operator = "*";
        neueEingabe = true;
    }

    @FXML
    protected void devide() {
        ersteZahl = Double.parseDouble(ausgabe.getText());
        operator = "/";
        neueEingabe = true;
    }

    @FXML
    protected void percent() {
        try {
            double zweiteZahl = Double.parseDouble(ausgabe.getText());
            if (!operator.isEmpty()) {
                zweiteZahl = ersteZahl * (zweiteZahl / 100.0);
                ausgabe.setText(String.valueOf(zweiteZahl));
            } else {
                zweiteZahl = zweiteZahl / 100.0;
                ausgabe.setText(String.valueOf(zweiteZahl));
            }
            neueEingabe = true;
        } catch (NumberFormatException e) {
            ausgabe.setText("Fehler");
        }
    }


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

    //Ziffern
    @FXML
    protected void one() {
        if (neueEingabe) {
            ausgabe.setText("");
            neueEingabe = false;
        }
        // ausgabe.getText(); && text auslesen gettext + settext dazu
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
            ausgabe.setText("");
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