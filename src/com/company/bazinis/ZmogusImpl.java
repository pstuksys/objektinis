package com.company.bazinis;

public class ZmogusImpl implements Zmogus {
    private String vardas;
    private String pavarde;
    private String lytis;
    private int amzius;
    private long asmensKodas;
    public ZmogusImpl(String vardas,String pavarde,String lytis, int amzius, long asmensKodas){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.lytis = lytis;
        this.amzius = amzius;
        this.asmensKodas = asmensKodas;
    }
    public String getVardas(){return vardas;}
    public void setVardas(String vardas){this.vardas = vardas;}
    public String getPavarde(){return pavarde;}
    public void setPavarde(String pavarde){this.pavarde = pavarde;}
    public String getLytis(){return lytis;}
    public void setLytis(String lytis){this.lytis = lytis;}
    public int getAmzius(){return amzius;}
    public void setAmzius(){this.amzius = amzius;}
    public long getAsmensKodas(){return asmensKodas;}
    public void setAsmensKodas(long asmensKodas){this.asmensKodas = asmensKodas;}

    public String toString(){
        return "Vardas " +  vardas + " Pavarde " + pavarde + " Lytis " + lytis + " Amzius " + amzius + " Asmens Kodas " + asmensKodas;
    }
}
