package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Automobil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class AutomobileRepositoryFileCsv {
    private ArrayList<Automobil> automobile = new ArrayList<Automobil>();
    private static int counterAutomobil = 0;
    public AutomobileRepositoryFileCsv(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] values = line.split(",");
            automobile.add(values[0], values[1],new Integer(values[2]),new Integer(values[3]),new Integer(values[4]),values[5], new Integer(values[6]),new Integer(values[7]),counterAutomobil, values[8],new Integer(values[9]));
            counterAutomobil++;
        }
    }

    public int getCounterAutomobil() {
        return counterAutomobil;
    }

    public ArrayList<Automobil> getAutomobile() {
        return automobile;
    }
}
