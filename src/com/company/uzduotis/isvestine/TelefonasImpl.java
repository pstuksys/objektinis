package com.company.uzduotis.isvestine;

import com.company.uzduotis.MoketojasImpl;

public class TelefonasImpl extends MoketojasImpl implements telefonas {
    private long numeris;
    public TelefonasImpl(String vardas, String pavarde, String adresas, double suma, long numeris){
        super(vardas,pavarde,adresas,suma);
        this.numeris = numeris;
    }
    public long getNumeris(){return numeris;}
    public void setNumeris(long numeris){this.numeris = numeris;}
    public String toString(){
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde() + " Adresas: " + getAdresas() + " Suma: " + getSuma() + " Telefono numeris: " + numeris;
    }
}
