package com.company.uzduotis;

public class MoketojasImpl implements moketojas {
    private String vardas;
    private String pavarde;
    private String adresas;
    private double suma;
    public MoketojasImpl(String vardas,String pavarde, String adresas, double suma){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }
    public String getVardas(){return vardas;}
    public void setVardas(String vardas){this.vardas = vardas;}
    public String getPavarde(){return pavarde;}
    public void setPavarde(String pavarde){this.pavarde = pavarde;}
    public String getAdresas(){return adresas;}
    public void setAdresas(String adresas){this.adresas = adresas;}
    public double getSuma(){return suma;}
    public void setSuma(double suma){this.suma = suma;}

    public String toString(){
        return "Vardas: " + vardas + " Pavarde: " + pavarde + " Adresas: " + adresas + " Suma: " + suma;
    }
}
