package com.gcode.invoicer;

/**
 * Created by gcode on 11/01/2023.
 */
public class Client {
    int N_client;
    String Nom;
    String Address;
    String Rc;
    String Mat_Fiscal;

    public Client() {
        //Empty
    }
    public Client(int n_client, String nom, String address, String rc, String mat_Fiscal) {
        N_client = n_client;
        Nom = nom;
        Address = address;
        Rc = rc;
        Mat_Fiscal = mat_Fiscal;
    }

    public Client(int n_client, String nom, String ad, String s) {
        N_client = n_client;
        Nom = nom;
        Address = ad;
        Mat_Fiscal = s;
    }

    public Client(int n_client, String nom, String ad) {
        N_client = n_client;
        Nom = nom;
        Address = ad;
    }


    public int getN_client() {
        return N_client;
    }

    public void setN_client(int n_client) {
        N_client = n_client;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getRc() {
        return Rc;
    }

    public void setRc(String rc) {
        Rc = rc;
    }

    public String getMat_Fiscal() {
        return Mat_Fiscal;
    }

    public void setMat_Fiscal(String mat_Fiscal) {
        Mat_Fiscal = mat_Fiscal;
    }
}
