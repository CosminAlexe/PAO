package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Automobil;
import java.io.File;
import java.util.ArrayList;

public class AutomobilRepository {
    private static int counterAutomobil;
    private ArrayList<Automobil> automobile = new ArrayList<Automobil>();

    public AutomobilRepository() {
        AutomobileRepositoryFileCsv automobileRepositoryFileCsv = new AutomobileRepositoryFileCsv("automobile.csv");
        counterAutomobil = automobileRepositoryFileCsv.getCounterAutomobil();
        automobile = automobileRepositoryFileCsv.getAutomobile();
        automobile.add(new Automobil("Ford", "Focus", 2002, 190000, 5, "benzina", 1600, 100,   counterAutomobil + 1, "compacta", 100));
        automobile.add(new Automobil("Opel", "Vectra", 2008, 40000, 5, "benzina", 1800, 140,   counterAutomobil + 2, "medie", 140));
        counterAutomobil += 2;
    }

    public void addAutomobil(){
        Automobil a = new Automobil();
        counterAutomobil++;
        a.AdaugareAutomobil(counterAutomobil);
        automobile.add(a);
    }

    public void afisareAutomobile(){
        for(int i = 0 ; i < automobile.size(); i++)
            automobile.get(i).AfisareAutomobil();
    }

    public static int getCounterAutomobil() {
        return counterAutomobil;
    }

    public ArrayList<Automobil> getAutomobile() {
        return automobile;
    }
}
