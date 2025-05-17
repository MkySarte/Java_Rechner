package com.example.rechner;

import javafx.scene.control.Button;

public class ButtonGUI {

        public static void onClickChangeColor(Button aktiv, Button... alleButtons) {

            for (Button b : alleButtons)
            {
                b.setStyle("-fx-background-color: orange; -fx-text-fill: white;");

            }
            if (aktiv != null) {
                aktiv.setStyle("-fx-background-color: #3399ff; -fx-text-fill: white;");
            }
        }

        public static void resetBtnColor(Button... alleButtons) {
            for (Button b : alleButtons) {
                b.setStyle("-fx-background-color: orange; -fx-text-fill: white;");
            }
        }

}
