package com.company;

import com.company.bazinis.ZmogusImpl;
import com.company.bazinis.isvestine.StatybininkasImpl;
import com.company.laboras.TransportasImpl;
import com.company.laboras.isvestine.AutomobolisImpl;
import com.company.notes.LeidinysImpl;
import com.company.notes.knygos.KnygaImpl;
import com.company.uzduotis.MoketojasImpl;
import com.company.uzduotis.internetas.InternetasImpl;
import com.company.uzduotis.isvestine.TelefonasImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ZmogusImpl jonas = new ZmogusImpl("Jonas","Jonaitis","Vyras",78, 123456781);
        ZmogusImpl juozas = new ZmogusImpl("Juozas","Juozaitis","Vyras",64,123456782);
        ZmogusImpl joana = new ZmogusImpl("Joana","Juodaite","Moteris",25,123456783);
        ZmogusImpl kristina = new ZmogusImpl("Kristina","Liaudanskiene","Moteris",45,123456784);
       // System.out.println(juozas);

        StatybininkasImpl ruslanas = new StatybininkasImpl("Ruslanas", "Petrovicius","Vyras",39,123456785, "Junior Developer",2,2124.50);
        StatybininkasImpl vytautas = new StatybininkasImpl("Vytautas", "Didysis"," Vyras", 33, 123456786, "Stalius",9, 1714.97);
        StatybininkasImpl liudmila = new StatybininkasImpl("Liudmila","Meilute","Moteris", 31, 123456787, "dazytoja", 6,3024.13);
        StatybininkasImpl inga = new StatybininkasImpl("Inga","Vaikule", "Moteris", 56, 123456788, "Darbo Vadove", 13,3854.50);

        //System.out.println(liudmila);
       // System.out.println(inga);


        ZmogusImpl[] Zmogus = new ZmogusImpl[8];
        Zmogus[0] = jonas;
        Zmogus[1] = juozas;
        Zmogus[2] = joana;
        Zmogus[3] = kristina;
        Zmogus[4] = ruslanas;
        Zmogus[5] = vytautas;
        Zmogus[6] = liudmila;
        Zmogus[7] = inga;
        double suma = 0;
            for(ZmogusImpl Zmones : Zmogus){
                if(Zmones instanceof StatybininkasImpl){
                    StatybininkasImpl Statybininkas = (StatybininkasImpl) Zmones;
                    suma = suma + Statybininkas.getAlga();
                }
            }
        System.out.println(suma);

        LeidinysImpl moteris = new LeidinysImpl("Zurnalas",true,70);
        LeidinysImpl incognito = new LeidinysImpl("Knyga",false,201);
        LeidinysImpl versloZinios = new LeidinysImpl("Laikrastis",true,16);
        //System.out.println(moteris);
        KnygaImpl zinios = new KnygaImpl("Laikrastis", true, 20, "Vakaro zinios",false, "mokomoji");
        KnygaImpl zurnalas = new KnygaImpl("Knyga",true,60, "Vyrams", true, "Trileris");
        KnygaImpl grozis = new KnygaImpl("Knyga", false, 400, "Meile",true,"Grozine");
        LeidinysImpl vienas = new LeidinysImpl("Knyga", false,501);
        LeidinysImpl du = new LeidinysImpl("Laikrastis",true,20);
        LeidinysImpl trys = new LeidinysImpl("Zurnalas", true, 41);
        LeidinysImpl keturi = new LeidinysImpl("Knyga",false,815);
        KnygaImpl knygaVienas = new KnygaImpl("Knyga",true,684,"Meile ir mirtis",true,"Grozine");
        KnygaImpl knygaDu = new KnygaImpl("Knyga",false,40,"Cigareciu zala psichikai", true, "Moksline");

        LeidinysImpl[] leidiniai = new LeidinysImpl[13];
        leidiniai[1] = moteris;
        leidiniai[2] = incognito;
        leidiniai[3] = versloZinios;
        leidiniai[4] = zinios;
        leidiniai[5] = zurnalas;
        leidiniai[6] = grozis;
        leidiniai[7] = vienas;
        leidiniai[8] = du;
        leidiniai[9] = trys;
        leidiniai[10] = keturi;
        leidiniai[11] = knygaVienas;
        leidiniai[12] = knygaDu;
        //String tipas = "Grozine";
        for(LeidinysImpl groziniai: leidiniai){
            if(groziniai instanceof KnygaImpl){
                KnygaImpl Knyga  = (KnygaImpl) groziniai;
                if(Knyga.getTipas()=="Grozine"){
                    System.out.println("Grozine literatura: " + Knyga.getPavadinimas());
                }
                //tipas += Knyga.getPavadinimas();
            }
        }
        //System.out.print("Knygos pavadinimas: "+ tipas);

        TransportasImpl automobolis1 = new TransportasImpl("sausumos", true, 2019);
        TransportasImpl automobolis2 = new TransportasImpl("oro",true, 2018);
        TransportasImpl automobolis3 = new TransportasImpl("vandens", true, 2016);
        AutomobolisImpl automobolisVienas = new AutomobolisImpl("sausumos", true, 2010, "Skoda", 4,false);
        AutomobolisImpl automobolisDu = new AutomobolisImpl("oro", true, 2016, "Boeing", 1, false);
        AutomobolisImpl automobolisTrys = new AutomobolisImpl("Vandens", true, 2017, "Mitsubishi Water 3000", 3, true);
        AutomobolisImpl automobolisKeturi = new AutomobolisImpl("sausumos", true, 2005, "Opel", 4, false);
        AutomobolisImpl automobolisPenki = new AutomobolisImpl("sausumos", true, 2016, "Tesla", 2, true);
        TransportasImpl automobilis4 = new TransportasImpl("sausumos", true,1967);
        TransportasImpl automobolis5 = new TransportasImpl("sausumos",true,1895);
        TransportasImpl[] priemones = new TransportasImpl[11];
        priemones[1] = automobolis1;
        priemones[2] = automobolis2;
        priemones[3] = automobolis3;
        priemones[4] = automobolisVienas;
        priemones[5] = automobolisDu;
        priemones[6] = automobolisTrys;
        priemones[7] = automobolisKeturi;
        priemones[8] = automobolisPenki;
        priemones[9] = automobilis4;
        priemones[10] = automobolis5;

       // boolean tiesa = true;
        for(TransportasImpl surasti : priemones){
            if(surasti instanceof AutomobolisImpl){
                AutomobolisImpl automobolis = (AutomobolisImpl) surasti;
                if(automobolis.getVaromasElektra()==true){
                    System.out.println("Automobliai varomi elektra: " + automobolis.getMarke());
                }
            }

        }
        MoketojasImpl moketojas1 = new MoketojasImpl("Jonas","Jonaitis","Jonaiciu g.13", 500);
        MoketojasImpl moketojas2 = new MoketojasImpl("Juozas","Juozaitis","Juozaiciu g.14", 13.26);
        MoketojasImpl moketojas3 = new MoketojasImpl("Ieva","Ievauskaite", "Pievu g.60", 15.87);
        TelefonasImpl moketojas4 = new TelefonasImpl("Ivanas","Ivanauskas","Ivano g.206",14.82, 868686866);
        TelefonasImpl moketojas5 = new TelefonasImpl("Svetlana","Svietauskaite","Sveciu g. 3", 2.37, 868686867);
        TelefonasImpl moketojas6 = new TelefonasImpl("Laisve","Laisvute","Liepu g.1", 35.77, 868686868);
        InternetasImpl moketojas7 = new InternetasImpl("Zydrunas","Savickas","Laisves al.13",205.45, "1.1.1.1");
        InternetasImpl moketojas8 = new InternetasImpl("Stefanija","Gonzalez", "Alcapulco 5", 24.45, "1.0.0.1");
        InternetasImpl moketojas9 = new InternetasImpl("Paulius","Paulauskas","Pauliaus g.13", 45.45, "8.8.8.8");

            MoketojasImpl[] moketojai = new MoketojasImpl[10];
            moketojai[1] = moketojas1;
            moketojai[2] = moketojas2;
            moketojai[3] = moketojas3;
            moketojai[4] = moketojas4;
            moketojai[5] = moketojas5;
            moketojai[6] = moketojas6;
            moketojai[7] = moketojas7;
            moketojai[8] = moketojas8;
            moketojai[9] = moketojas9;
                double sumaa = 0;
            for(MoketojasImpl ieskoti:moketojai){
                if(ieskoti instanceof TelefonasImpl){
                    TelefonasImpl telefonas = (TelefonasImpl) ieskoti;
                    sumaa += telefonas.getSuma();
                }
            }System.out.println("Suma uz telefona bendra: " + sumaa);
                double sumaaaa = 0;
            for(MoketojasImpl ieskoti:moketojai){
                if(ieskoti instanceof InternetasImpl){
                    InternetasImpl internetas = (InternetasImpl) ieskoti;
                    sumaaaa +=internetas.getSuma();
                }
            }
        System.out.println("Suma uz interneta: " + sumaaaa);
            double bendras = sumaa + sumaaaa;
        System.out.println("Bendra suma uz telefona ir interneta: " + bendras);
    }
}
