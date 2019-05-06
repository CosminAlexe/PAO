package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Autoutilitara;
import InchiriereVehicule.domain.entitati.Camion;

import java.io.FileWriter;
import java.util.ArrayList;

public class CamionRepository {
    private static int counterCamion = 1;
    private ArrayList<Camion> camioane = new ArrayList<Camion>();

    public CamionRepository() {
        CamionRepositoryFileCsv camionRepositoryFileCsv= new CamionRepositoryFileCsv("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\camioane.csv");
        counterCamion = camionRepositoryFileCsv.getCounterCamion() + 1;
        camioane = camionRepositoryFileCsv.getCamioane();
        camioane.add(new Camion("Volvo", "FH", 2016, 820000, 3, "diesel", 5400, 425, counterCamion, 8100, 350, "D"));
    }

    public void CamionWriter(String fileName, Camion ob){
        try{
            FileWriter fw = new FileWriter(fileName,true);
            fw.write(ob.toString() + System.lineSeparator());
            fw.close();}
        catch(Exception e){ System.out.println(e);}
    }
    public void addCamion(){
        Camion c = new Camion();
        counterCamion++;
        c.AdaugaCamion(counterCamion);
        camioane.add(c);
    }

    public void afisareCamioane(){
        for(int i = 0 ; i < camioane.size(); i++)
            camioane.get(i).AfisareCamion();
    }

    public ArrayList<Camion> getCamioane() {
        return camioane;
    }
}
