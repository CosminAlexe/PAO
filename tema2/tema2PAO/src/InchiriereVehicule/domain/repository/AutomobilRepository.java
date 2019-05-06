package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Automobil;

import java.io.FileWriter;
import java.util.ArrayList;


public class AutomobilRepository {
    private static int counterAutomobil = 0;
    private ArrayList<Automobil> automobile = new ArrayList<Automobil>();

    public AutomobilRepository() {
        AutomobileRepositoryFileCsv automobileRepositoryFileCsv = new AutomobileRepositoryFileCsv("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\automobile.csv");
        counterAutomobil = automobileRepositoryFileCsv.getCounterAutomobil();
        automobile = automobileRepositoryFileCsv.getAutomobile();
        automobile.add(new Automobil("Ford", "Focus", 2002, 190000, 5, "benzina", 1600, 100,   counterAutomobil + 1, "compacta", 100));
        automobile.add(new Automobil("Opel", "Vectra", 2008, 40000, 5, "benzina", 1800, 140,   counterAutomobil + 2, "medie", 140));
        counterAutomobil += 2;
    }
    public void AutomobilWriter(String fileName, Automobil ob){
        try{
            FileWriter fw = new FileWriter(fileName,true);
            fw.write(ob.toString() + System.lineSeparator());
            fw.close();}
        catch(Exception e){ System.out.println(e);}
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

    public ArrayList<Automobil> getAutomobile() {
        return automobile;
    }
}
