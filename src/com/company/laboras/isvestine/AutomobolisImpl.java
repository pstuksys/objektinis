package com.company.laboras.isvestine;

import com.company.laboras.TransportasImpl;

public class AutomobolisImpl extends TransportasImpl implements automobolis {
    private String marke;
    private int duruSkaicius;
    private boolean varomasElektra;
    public AutomobolisImpl(String tipas, boolean variklis, int metai, String marke, int duruSkaicius, boolean varomasElektra){
        super(tipas,variklis,metai);
        this.marke = marke;
        this.duruSkaicius = duruSkaicius;
        this.varomasElektra = varomasElektra;
    }
    public String getMarke(){return marke;}
    public void setMarke(String marke){this.marke = marke;}
    public int getDuruSkaicius(){return duruSkaicius;}
    public void setDuruSkaicius(int duruSkaicius){this.duruSkaicius = duruSkaicius;}
    public boolean getVaromasElektra(){return varomasElektra;}
    public void setVaromasElektra(boolean varomasElektra){this.varomasElektra = varomasElektra;}
    public String toString(){
        return "Tipas: " + getTipas() + " Variklis: " + getVariklis() + " Metai: " + getMetai() + " Marke: " + marke + " Duru skaicius: " + duruSkaicius + " Varomas elektra: " + varomasElektra;
    }
}
