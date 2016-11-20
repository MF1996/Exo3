package com.company;

/**
 * Created by User on 20/11/2016.
 */
public class Robot {
    private String nom;
    private int x, y;
    private String direction;


      public Robot(String nom){
          this.nom = nom;
          direction="Est";
      }
    public void avancer(){
        switch(direction) {
            case "Nord":   y++;
                break;
            case "Sud":    y--;
                break;
            case "Est":    x++;
                break;
            case "Ouest":  x--;
                break;
            default:
                System.out.print("direction existe pas"); break;

        }
    }
    public void droite() {
        switch (direction) {
            case "Nord":
                direction = "Est";
                break;
            case "Sud":
                direction = "Ouest";
                break;
            case "Est":
                direction = "Sud";
                break;
            case "Ouest":
                direction = "Nord";
                break;
            default:
                System.out.print("direction existe pas"); break;
        }
    }
    public void affiche(){
        System.out.println("nom"+nom);
        System.out.println("x"+x);
        System.out.println("y"+y);
        System.out.println("direction"+direction);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
