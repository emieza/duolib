package com.enricmieza.duolib;

import java.util.ArrayList;

public class Curs {

    public class Exercici {
        public String titol;
        public String instruccions;
        public String fraseOrigen;
        public String fraseDesti;
        public int punts;
    }

    public class Categoria {
        public String titol;
        public ArrayList<Exercici> exercicis;

        public Categoria() {
            titol = "Bàsic 1";

            Exercici e1 = new Exercici();
            e1.titol = "Traduccio1";
            e1.instruccions = "Tradueix la frase";
            e1.fraseOrigen = "Un bon día al matí";
            e1.fraseDesti = "A nice day in the morning";
            e1.punts = 1000;

            Exercici e2 = new Exercici();
            e2.titol = "Traduccio2";
            e2.instruccions = "Tradueix la frase";
            e2.fraseOrigen = "Dábale arroz a la zorra el abad";
            e2.fraseDesti = "The abbot was giving rice to the fox";
            e2.punts = 1000;

            exercicis = new ArrayList<>();
            exercicis.add( e1 );
            exercicis.add( e2 );
        }
    }

    public String titol;
    public String originLangCode;
    public String destLangCode;
    public ArrayList<Categoria> cats;

    public Curs() {
        titol = "English from Català";
        originLangCode = "ca";
        destLangCode = "en";

        Categoria cat1 = new Categoria();
        Categoria cat2 = new Categoria();
        cat2.titol = "Menjar";

        cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
    }
}
