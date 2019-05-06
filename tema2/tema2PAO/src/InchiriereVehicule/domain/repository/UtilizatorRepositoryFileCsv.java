package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Autoutilitara;
import InchiriereVehicule.domain.entitati.Utilizator;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class UtilizatorRepositoryFileCsv  {
    private ArrayList<Utilizator> utilizatori = new ArrayList<Utilizator>();
    private static int counterUt = 0;
    public UtilizatorRepositoryFileCsv(String fileName){
        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                utilizatori.add(new Utilizator(new Integer(values[0]), values[1], values[2]));
                counterUt = new Integer(values[0]);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Cound not create BookRepositoryFileImpl: "+e.getMessage());
        }
    }

    public ArrayList<Utilizator> getUtilizatori() {
        return utilizatori;
    }

    public int getCounterUt() {
        return counterUt;
    }
}

