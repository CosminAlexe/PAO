package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Autoutilitara;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class AutoutilitaraRepositoryFileCsv {
    private ArrayList<Autoutilitara> autoutilitare = new ArrayList<Autoutilitara>();
    private static int counterAutoutilitara = 0;
    public AutoutilitaraRepositoryFileCsv(String fileName){
        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                autoutilitare.add(new Autoutilitara(values[0], values[1], new Integer(values[2]), new Integer(values[3]), new Integer(values[4]), values[5], new Integer(values[6]), new Integer(values[7]), new Integer(values[8]),new Integer(values[9]), new Integer(values[10])));
                counterAutoutilitara = new Integer(values[8]);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Cound not create BookRepositoryFileImpl: "+e.getMessage());
        }
    }

    public ArrayList<Autoutilitara> getAutoutilitare() {
        return autoutilitare;
    }

    public int getCounterAutoutilitara() {
        return counterAutoutilitara;
    }
}
