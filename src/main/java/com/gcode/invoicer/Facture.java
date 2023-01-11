package com.gcode.invoicer;

/**
 * Created by MBI on 11/01/2023.
 */
public class Facture{
    private int NumFact;

    Article art = new Article();
    Client clt = new Client();
    int Client;
    String Date;
    int Ttc;

    public Facture(int numFact, int client , int ttc,String date ) {
        NumFact = numFact;
        Client = client;
        Date = date;
        Ttc=ttc;
    }
    public int getNumFact() {
        return NumFact;
    }
    public void setNumFact(int n_Facture) {
        NumFact = n_Facture;
    }
    public int getClient() {
        return Client;
    }
    public void setClient(int c) {
        Client = c;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String Date) {
        this.Date = Date;
    }
    public int getTtc() {
        return Ttc;
    }
    public void setTtc(int TTC) {
        this.Ttc = TTC;
    }
}
