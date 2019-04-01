import InchiriereVehicule.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        ArrayList<Automobil> automobile = new ArrayList<Automobil>();
        ArrayList<Autoutilitara> autoutilitare = new ArrayList<Autoutilitara>();
        ArrayList<Utilizator> utilizatori = new ArrayList<Utilizator>();
        ArrayList<Rezervare> rezervari = new ArrayList<Rezervare>();

        Servicii s = new Servicii();
        int val = 1;
        int selector;
        while (val == 1){
            System.out.println("ALEGE 1 PENTRU INSERARE AUTOMOBIL");
            System.out.println("ALEGE 2 PENTRU INSERARE AUTOUTILITARA");
            System.out.println("ALEGE 3 PENTRU INSERARE UTLIZATOR");
            System.out.println("ALEGE 4 PENTRU AFISAREA LISTEI DE AUTOMOBILE");
            System.out.println("ALEGE 5 PENTRU AFISAREA LISTEI AUTOUTILITARE");
            System.out.println("ALEGE 6 PENTRU AFISAREA LISTEI DE UTILIZATORI");
            selector = cin.nextInt();
            switch (selector){
                case 1: s.addAutomobil(automobile);break;
                case 2: s.addAutoutilitara(autoutilitare);break;
                case 3: s.addUtilizator(utilizatori);break;
                case 4: s.afisareAutomobile(automobile);break;
                case 5: s.afisareAutoutilitare(autoutilitare);break;
                case 6: s.afisareUtilizatori(utilizatori);break;
                case 0: val = 0; break;
            }

        }
    }
}
