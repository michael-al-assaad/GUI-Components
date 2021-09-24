package com.michaelalassaad.components;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application  {
    @Override
    public void start (Stage stage) throws IOException {
        VBox vBox = new VBox (10);
        Scene scene = new Scene (vBox, 320, 240);
        ScrollPane scrollPane = new ScrollPane ();
        RadioButton radioButton = new RadioButton ("Pasta");
        scrollPane.setVbarPolicy (ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setContent (radioButton);

        vBox.getChildren ().addAll (scrollPane, radioButton);
        stage.setTitle ("Scroll Pane Example");
        stage.setScene (scene);
        stage.show ();
    }

    public static void main (String[] args) {
        launch ();
    }


}