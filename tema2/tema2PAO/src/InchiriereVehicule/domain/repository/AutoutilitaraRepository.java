package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Automobil;
import InchiriereVehicule.domain.entitati.Autoutilitara;

import java.io.FileWriter;
import java.util.ArrayList;



public class AutoutilitaraRepository {
    private static int counterAutoutilitare = 1;
    private ArrayList<Autoutilitara> autoutilitare = new ArrayList<Autoutilitara>();

    public AutoutilitaraRepository() {
        AutoutilitaraRepositoryFileCsv autoutilitaraRepositoryFileCsv = new AutoutilitaraRepositoryFileCsv("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\autoutilitare.csv");
        counterAutoutilitare = autoutilitaraRepositoryFileCsv.getCounterAutoutilitara() + 1;
        autoutilitare = autoutilitaraRepositoryFileCsv.getAutoutilitare();
        autoutilitare.add(new Autoutilitara("Renault", "Master", 2009, 320000, 5, "diesel", 1900, 125, counterAutoutilitare, 2100, 150));
    }

    public void AutoutilitaraWriter(String fileName, Autoutilitara ob){
        try{
            FileWriter fw = new FileWriter(fileName,true);
            fw.write(ob.toString() + System.lineSeparator());
            fw.close();}
        catch(Exception e){ System.out.println(e);}
    }
    public void addAutouitilitara(){
        Autoutilitara a = new Autoutilitara();
        counterAutoutilitare++;
        a.AdaugaAutoutilitara(counterAutoutilitare);
        autoutilitare.add(a);
    }

    public void afisareAutoutilitare(){
        for(int i = 0 ; i < autoutilitare.size(); i++)
            autoutilitare.get(i).AfisareAutoutilitara();
    }

    public ArrayList<Autoutilitara> getAutoutilitare() {
        return autoutilitare;
    }
}
