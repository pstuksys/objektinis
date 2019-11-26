package com.company.bazinis.isvestine;

import com.company.bazinis.ZmogusImpl;

public class StatybininkasImpl extends ZmogusImpl implements Statybininkas{
    private String kvalifikacija;
    private int darboStazas;
    private double alga;

    public StatybininkasImpl(String vardas, String pavarde, String lytis, int amzius, long asmensKodas, String kvalifikacija,int darboStazas,double alga) {
        super(vardas, pavarde, lytis, amzius, asmensKodas);
        this.kvalifikacija = kvalifikacija;
        this.darboStazas = darboStazas;
        this.alga = alga;
    }
    public String getKvalifikacija(){return kvalifikacija;}
    public void setKvalifikacija(String kvalifikacija){this.kvalifikacija = kvalifikacija;}
    public int getDarboStazas(){return darboStazas;}
    public void setDarboStazas(int darboStazas){this.darboStazas = darboStazas;}
    public double getAlga(){return alga;}
    public void setAlga(){this.alga = alga;}
    public String toString(){
        return  "Vardas " + getVardas() + " Pavarde " + getPavarde() + " Lytis " + getLytis() + " Amzius " + getAmzius() + " Asmens Kodas " + getAsmensKodas() + "  Kvalifikacija " + kvalifikacija + " Darbo Stazas " + darboStazas + " Atlyginimas " + alga;
    }
}
