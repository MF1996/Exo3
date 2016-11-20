package com.company;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {    Robot robot[] = new Robot[100];

        for (int nbrobot=0;nbrobot<=6;nbrobot++){

            robot[nbrobot]=new Robot("backslash");
            robot[nbrobot].affiche();
        }


        robot[7]=new RobotNG("eset");
        robot[7].affiche();


    }
}
