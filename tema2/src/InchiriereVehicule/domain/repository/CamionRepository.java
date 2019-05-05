package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Camion;

import java.util.ArrayList;

public class CamionRepository {
    private static int counterCamion = 1;
    private ArrayList<Camion> camioane = new ArrayList<Camion>();

    public CamionRepository() {
        camioane.add(new Camion("Volvo", "FH", 2016, 820000, 3, "diesel", 5400, 425, 1, 8100, 350, "D"));
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
}
