package com.company.uzduotis.siluma;

import com.company.uzduotis.MoketojasImpl;

public class SildymasImpl extends MoketojasImpl implements sildymas {
    private double kubai;
    public SildymasImpl(String vardas, String pavarde, String adresas, double suma, double kubai){
        super(vardas,pavarde,adresas,suma);
        this.kubai = kubai;
    }
    public double getKubai(){return kubai;}
    public void setKubai(double kubai){this.kubai = kubai;}

    public String toString(){
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde() + " Adresas: " + getAdresas() + " Suma: " + getSuma() + " Sildymui isleisti kubai: " + kubai;
    }
}
