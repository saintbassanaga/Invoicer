package com.gcode.invoicer;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * Created by gcode on 11/01/2023.
 */
public class Article {
    private int NumArticle;
    String Libelle;
    double Prix;
    double TVA;
    CheckBox check;
    TextField txt ;

    public Article() {

    }

    public TextField getTxt() {
        return txt;
    }

    public void setTxt(TextField txt) {
        this.txt = txt;

    }

    public Article(String Libelle){this.Libelle = Libelle;}
    public Article(String Libelle,CheckBox ch){ check = ch ;this.Libelle = Libelle; txt= new TextField();
        //ch.setStyle();
        txt.setStyle("-fx-background-color: #2e354f; -fx-border-color: #8c90b3; -fx-border-radius: 2; -fx-text-inner-color:white;");
        txt.setPrefWidth(33.0);}
    public Article(int numArticle, String libelle, double prix) {
        NumArticle =numArticle ;
        Libelle = libelle;
        Prix = prix;
        TVA = Prix*0.19;
    }
    public int getNumArticle() {
        return NumArticle;
    }
    public String getLibelle() {
        return Libelle;
    }
    public void setLibelle(String libelle) {
        Libelle = libelle;
    }
    public double getPrix() {
        return Prix;
    }
    public void setPrix(int prix) {
        this.Prix = prix;
    }
    public double getTVA() {
        return TVA;
    }

    public CheckBox getCheck() {
        return check;
    }

    public void setCheck(CheckBox check) {
        this.check = check;
    }
}
