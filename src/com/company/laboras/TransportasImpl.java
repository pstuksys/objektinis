package com.company.laboras;

public class TransportasImpl implements transportas{
    private String tipas; // sausumos, oro,vandens;
    private boolean variklis;
    private int metai;
    public TransportasImpl(String tipas, boolean variklis, int metai){
        this.tipas = tipas;
        this.variklis = variklis;
        this.metai = metai;
    }
    public String getTipas(){return tipas;}
    public void setTipas(String tipas){this.tipas = tipas;}
    public boolean getVariklis(){return variklis;}
    public void setVariklis(boolean variklis){this.variklis = variklis;}
    public int getMetai(){return metai;}
    public void setMetai(int metai){this.metai = metai;}
    public String toString(){
        return "Tipas: " + tipas + " Variklis: " + variklis + " Metai: " + metai;
    }
}
