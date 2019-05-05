import InchiriereVehicule.Servicii.Servicii;
import InchiriereVehicule.domain.entitati.Automobil;
import InchiriereVehicule.domain.entitati.Autoutilitara;
import InchiriereVehicule.domain.entitati.Rezervare;
import InchiriereVehicule.domain.entitati.Utilizator;
import InchiriereVehicule.domain.repository.AutomobilRepository;
import InchiriereVehicule.domain.repository.AutoutilitaraRepository;
import InchiriereVehicule.domain.repository.CamionRepository;
import InchiriereVehicule.domain.repository.UtilizatorRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);


        AutomobilRepository automobilRepository = new AutomobilRepository();
        AutoutilitaraRepository autoutilitaraRepository = new AutoutilitaraRepository();
        CamionRepository camionRepository = new CamionRepository();
        UtilizatorRepository utilizatorRepository = new UtilizatorRepository();
        int val = 1;
        int selector;
        while (val == 1){
            System.out.println("ALEGE 1 PENTRU INSERARE AUTOMOBIL");
            System.out.println("ALEGE 2 PENTRU INSERARE AUTOUTILITARA");
            System.out.println("ALEGE 3 PENTRU INSERARE CAMION");
            System.out.println("ALEGE 4 PENTRU INSERARE UTLIZATOR");
            System.out.println("ALEGE 5 PENTRU AFISAREA LISTEI DE AUTOMOBILE");
            System.out.println("ALEGE 6 PENTRU AFISAREA LISTEI AUTOUTILITARE");
            System.out.println("ALEGE 7 PENTRU AFISAREA LISTEI CAMIOANE");
            System.out.println("ALEGE 8 PENTRU AFISAREA LISTEI DE UTILIZATORI");
            selector = cin.nextInt();
            switch (selector){
                case 1: automobilRepository.addAutomobil();break;
                case 2: autoutilitaraRepository.addAutouitilitara();break;
                case 3: camionRepository.addCamion();break;
                case 4: utilizatorRepository.addUtilizator();break;
                case 5: automobilRepository.afisareAutomobile();break;
                case 6: autoutilitaraRepository.afisareAutoutilitare();break;
                case 7: camionRepository.afisareCamioane();break;
                case 8: utilizatorRepository.afisareUtilizatori();break;
                case 0: val = 0; break;
            }

        }
    }
}
