package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Automobil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class AutomobileRepositoryFileCsv  {
    private ArrayList<Automobil> automobile = new ArrayList<Automobil>();
    private static int counterAutomobil = 0;
    public AutomobileRepositoryFileCsv(String fileName){
        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                automobile.add(new Automobil(values[0], values[1], new Integer(values[2]), new Integer(values[3]), new Integer(values[4]), values[5], new Integer(values[6]), new Integer(values[7]), new Integer(values[8]),values[9], new Integer(values[10])));
                counterAutomobil = new Integer(values[8]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cound not create : "+e.getMessage());
        }
    }

    public int getCounterAutomobil() {
        return counterAutomobil;
    }

    public ArrayList<Automobil> getAutomobile() {
        return automobile;
    }
}
