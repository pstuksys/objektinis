package com.company.uzduotis.internetas;

import com.company.uzduotis.MoketojasImpl;

public class InternetasImpl extends MoketojasImpl implements internetas {
    private String ip;
    public InternetasImpl(String vardas, String pavarde, String adresas, double suma, String ip){
        super(vardas,pavarde,adresas,suma);
        this.ip = ip;
    }
    public String getIp(){return ip;}
    public void setIp(String ip){this.ip = ip;}

    public String toString(){
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde() + " Adresas: " + getAdresas() + " Suma: " + getSuma() + " IP adresas: " + ip;
    }
}
