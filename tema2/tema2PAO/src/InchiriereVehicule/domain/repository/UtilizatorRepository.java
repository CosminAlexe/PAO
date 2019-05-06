package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Rezervare;
import InchiriereVehicule.domain.entitati.Utilizator;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class UtilizatorRepository {
    private static int counterUt = 1;
    private ArrayList<Utilizator>  utilizatori = new ArrayList<Utilizator>();

    public UtilizatorRepository() {
        UtilizatorRepositoryFileCsv utilizatorRepositoryFileCsv = new UtilizatorRepositoryFileCsv("C:\\Users\\Cosmin\\Desktop\\tema2PAO\\utilizatori.csv");
        counterUt = utilizatorRepositoryFileCsv.getCounterUt() + 1;
        utilizatori= utilizatorRepositoryFileCsv.getUtilizatori();
        utilizatori.add(new Utilizator(counterUt, "Alexe Cosmin", "alexe.cosmin.97@gmail.com") );
    }

    public void addUtilizator(){
        Scanner cin = new Scanner(System.in);
        counterUt++;
        String nume;
        String email;

        System.out.println("Nume: ");
        nume = cin.nextLine();
        System.out.println("E-mail: ");
        email = cin.nextLine();

        Utilizator u = new Utilizator(counterUt, nume, email);
        utilizatori.add(u);
    }

    public void UtilizatorWriter(String fileName, Utilizator ob){
        try{
            FileWriter fw = new FileWriter(fileName,true);
            fw.write(ob.toString() + System.lineSeparator());
            fw.close();}
        catch(Exception e){ System.out.println(e);}
    }
    public void afisareUtilizatori(){
        for(int i = 0; i < utilizatori.size(); i++ )
            System.out.println( "Nume: " + utilizatori.get(i).getNume() + " e-mail: " + utilizatori.get(i).getEmail() + " id: " + utilizatori.get(i).getId());
    }

    public ArrayList<Utilizator> getUtilizatori() {
        return utilizatori;
    }
}
