package com.company.notes.knygos;

import com.company.notes.LeidinysImpl;

public class KnygaImpl extends LeidinysImpl implements Knyga {
    private String pavadinimas;
    private boolean kietasVirselis;
    private String tipas; // (mokomoji, grožinė, mokslinė, fantastinė, trileris..)
    public KnygaImpl(String rusis, boolean periodinis, int puslapiuSkaicius, String pavadinimas,boolean kietasVirselis, String tipas) {
        super(rusis, periodinis, puslapiuSkaicius);
        this.pavadinimas = pavadinimas;
        this.kietasVirselis = kietasVirselis;
        this.tipas = tipas;
    }
    public String getPavadinimas(){return pavadinimas;}
    public void setPavadinimas(String pavadinimas){this.pavadinimas = pavadinimas;}
    public boolean getKietasVirselis(){return kietasVirselis;}
    public void setKietasVirselis(boolean kietasVirselis){this.kietasVirselis = kietasVirselis;}
    public String getTipas(){return tipas;}
    public void setTipas(String tipas){this.tipas = tipas;}
    public String toString(){
        return "Knygos rusis: " + getRusis() + " Periodinis: " + getPeriodinis() + " puslapiu skaicius: " + getPuslapiuSkaicius() + " Pavadinimas " + pavadinimas + " Kietas Virselis: " + kietasVirselis + " tipas " + tipas;
    }
}
