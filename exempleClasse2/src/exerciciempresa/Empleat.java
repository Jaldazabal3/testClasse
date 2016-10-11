/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciempresa;

/**
 * Class of a single employee
 * @author jaldazabal
 */
public class Empleat {
    private String nom;
    private int sou;
    //Constructor
    public Empleat(String nom, int complements) {
        this.nom = nom;
        this.sou = 800+complements;
    }
    //Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }
    
}
