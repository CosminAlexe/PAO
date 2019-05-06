import InchiriereVehicule.Servicii.Servicii;
import InchiriereVehicule.domain.entitati.Automobil;
import InchiriereVehicule.domain.entitati.Autoutilitara;
import InchiriereVehicule.domain.entitati.Rezervare;
import InchiriereVehicule.domain.entitati.Utilizator;
import InchiriereVehicule.domain.repository.AutomobilRepository;
import InchiriereVehicule.domain.repository.AutoutilitaraRepository;
import InchiriereVehicule.domain.repository.CamionRepository;
import InchiriereVehicule.domain.repository.UtilizatorRepository;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);


        AutomobilRepository automobilRepository = new AutomobilRepository();
        automobilRepository.AutomobilWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\automobile.csv", automobilRepository.getAutomobile().get(automobilRepository.getAutomobile().size()-2));
        automobilRepository.AutomobilWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\automobile.csv", automobilRepository.getAutomobile().get(automobilRepository.getAutomobile().size()-1));
        AutoutilitaraRepository autoutilitaraRepository = new AutoutilitaraRepository();
        autoutilitaraRepository.AutoutilitaraWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\autoutilitare.csv", autoutilitaraRepository.getAutoutilitare().get(autoutilitaraRepository.getAutoutilitare().size()-1));
        CamionRepository camionRepository = new CamionRepository();
        camionRepository.CamionWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\camioane.csv", camionRepository.getCamioane().get(camionRepository.getCamioane().size()-1));
        UtilizatorRepository utilizatorRepository = new UtilizatorRepository();
        utilizatorRepository.UtilizatorWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\utilizatori.csv" , utilizatorRepository.getUtilizatori().get(utilizatorRepository.getUtilizatori().size()-1));
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
                case 1: automobilRepository.addAutomobil();
                    automobilRepository.AutomobilWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\automobile.csv", automobilRepository.getAutomobile().get(automobilRepository.getAutomobile().size()-1));
                    try{
                        FileWriter fv = new FileWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\audit.csv",true);
                        fv.write("addAutomobil , "+ (new Date()).toString() + System.lineSeparator());
                        fv.close();
                    }
                    catch(Exception e){ System.out.println(e);}
                    break;
                case 2: autoutilitaraRepository.addAutouitilitara();
                    autoutilitaraRepository.AutoutilitaraWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\autoutilitare.csv", autoutilitaraRepository.getAutoutilitare().get(autoutilitaraRepository.getAutoutilitare().size()-1));
                    try{
                        FileWriter fv = new FileWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\audit.csv",true);
                        fv.write("addAutoutilitara , "+ (new Date()).toString() + System.lineSeparator());
                        fv.close();
                    }
                    catch(Exception e){ System.out.println(e);}
                    break;
                case 3: camionRepository.addCamion();
                    camionRepository.CamionWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\camioane.csv", camionRepository.getCamioane().get(camionRepository.getCamioane().size()-1));
                    try{
                        FileWriter fv = new FileWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\audit.csv",true);
                        fv.write("addCamion , "+ (new Date()).toString() + System.lineSeparator());
                        fv.close();
                    }
                    catch(Exception e){ System.out.println(e);}
                    break;
                case 4: utilizatorRepository.addUtilizator();
                    utilizatorRepository.UtilizatorWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\utilizatori.csv" , utilizatorRepository.getUtilizatori().get(utilizatorRepository.getUtilizatori().size()-1));
                    try{
                        FileWriter fv = new FileWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\audit.csv",true);
                        fv.write("addUtilizator , "+ (new Date()).toString() + System.lineSeparator());
                        fv.close();
                    }
                    catch(Exception e){ System.out.println(e);}
                    break;
                case 5: automobilRepository.afisareAutomobile();
                    try{
                        FileWriter fv = new FileWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\audit.csv",true);
                        fv.write("afisareAutomobile , "+ (new Date()).toString() + System.lineSeparator());
                        fv.close();
                    }
                    catch(Exception e){ System.out.println(e);}
                    break;
                case 6: autoutilitaraRepository.afisareAutoutilitare();
                    try{
                        FileWriter fv = new FileWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\audit.csv",true);
                        fv.write("afisareAutoutilitare , "+ (new Date()).toString() + System.lineSeparator());
                        fv.close();
                    }
                    catch(Exception e){ System.out.println(e);}
                    break;
                case 7: camionRepository.afisareCamioane();
                    try{
                        FileWriter fv = new FileWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\audit.csv",true);
                        fv.write("afisareCamioane , "+ (new Date()).toString() + System.lineSeparator());
                        fv.close();
                    }
                    catch(Exception e){ System.out.println(e);}
                    break;
                case 8: utilizatorRepository.afisareUtilizatori();
                    try{
                        FileWriter fv = new FileWriter("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\audit.csv",true);
                        fv.write("afisareUtilizatori , "+ (new Date()).toString() + System.lineSeparator());
                        fv.close();
                    }
                    catch(Exception e){ System.out.println(e);}
                    break;
                case 0: val = 0; break;
            }

        }
    }
}
