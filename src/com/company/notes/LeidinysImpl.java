package com.company.notes;

public class LeidinysImpl implements Leidinys {
    private String rusis; //knygos, laikrasciai, zurnalai
    private boolean periodinis;
    private int puslapiuSkaicius;
    public LeidinysImpl(String rusis,boolean periodinis,int puslapiuSkaicius){
        this.rusis = rusis;
        this.periodinis = periodinis;
        this.puslapiuSkaicius = puslapiuSkaicius;
    }
    public String getRusis(){return rusis;}
    public void setRusis(String rusis){this.rusis = rusis;}
    public boolean getPeriodinis(){return periodinis;}
    public void setPeriodinis(boolean periodinis){this.periodinis = periodinis;}
    public int getPuslapiuSkaicius(){return puslapiuSkaicius;}
    public void setPuslapiuSkaicius(){this.puslapiuSkaicius = puslapiuSkaicius;}

        public String toString(){
        return "Knygos rusis: " + rusis + " Periodinis: " + periodinis + " puslapiu skaicius: " + puslapiuSkaicius;
        }
}
