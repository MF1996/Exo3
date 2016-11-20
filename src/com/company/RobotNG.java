package com.company;

/**
 * Created by User on 20/11/2016.
 */
public class RobotNG extends  Robot {
    public RobotNG(String nom) {
        super(nom);
    }


    public void avancer(int nbpas) {
        if (nbpas >= 1) {
            switch (getDirection()) {
                case "Nord":
                    setY(getY() + nbpas);
                    break;
                case "Sud":
                    setY(getY() - nbpas);
                    break;
                case "Est":
                    setX(getX() + nbpas);
                    break;
                case "Ouest":
                    setX(getX() - nbpas);
                    break;

            }
        } else
            System.out.print("je ne pas marcher en arrière");
    }

    public void gauche() {
        switch (getDirection()) {
            case "Nord":
                setDirection("Ouest");
                break;
            case "Sud":
                setDirection("Est");
                break;
            case "Est":
                setDirection("Nord");

                break;
            case "Ouest":
                setDirection("Sud");
                break;
        }
    }

    public void gauche3fois() {
        switch (getDirection()) {
            case "Nord":
                setDirection("Ouest");
                break;
            case "Sud":
                setDirection("Est");
                break;
            case "Est":
                setDirection("Nord");

                break;
            case "Ouest":
                setDirection("Sud");
                break;
        }
    }

    public void demiTour() {
        switch (getDirection()) {
            case "Nord":
                setDirection("Sud");
                break;
            case "Sud":
                setDirection("Nord");
                break;
            case "Est":
                setDirection("Ouest");

                break;
            case "Ouest":
                setDirection("Est");
                break;
        }
    }

    public void affiche(String modeTurbo, int nbpas) {
        if (modeTurbo.equals("ON")) {
            avancer(nbpas * 3);
            if (modeTurbo.equals("OFF")) {
                avancer();
            }
        }
    }
}