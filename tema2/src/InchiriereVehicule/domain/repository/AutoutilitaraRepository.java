package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Automobil;
import InchiriereVehicule.domain.entitati.Autoutilitara;

import java.util.ArrayList;

public class AutoutilitaraRepository {
    private static int counterAutoutilitare = 1;
    private ArrayList<Autoutilitara> autoutilitare = new ArrayList<Autoutilitara>();

    public AutoutilitaraRepository() {
        autoutilitare.add(new Autoutilitara("Renault", "Master", 2009, 320000, 5, "diesel", 1900, 125, 1, 2100, 150));
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
}
