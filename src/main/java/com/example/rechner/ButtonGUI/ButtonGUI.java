package com.example.rechner;

import javafx.scene.control.Button;

public class ButtonGUI {

        public static void markiereOperator(Button aktiv, Button... alleButtons) {

            for (Button b : alleButtons)
            {
                aktiv.setStyle(null);

            }
            if (aktiv != null) {
                aktiv.setStyle("-fx-background-color: #3399ff; -fx-text-fill: white;");
            }
        }

}
