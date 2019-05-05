package InchiriereVehicule.domain.repository;

import InchiriereVehicule.domain.entitati.Rezervare;
import InchiriereVehicule.domain.entitati.Utilizator;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilizatorRepository {
    private static int counterUt = 1;
    private ArrayList<Utilizator>  utilizatori = new ArrayList<Utilizator>();

    public UtilizatorRepository() {
        utilizatori.add(new Utilizator(1, "Alexe Cosmin", "alexe.cosmin.97@gmail.com") );
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

    public void afisareUtilizatori(){
        for(int i = 0; i < utilizatori.size(); i++ )
            System.out.println( "Nume: " + utilizatori.get(i).getNume() + " e-mail: " + utilizatori.get(i).getEmail() + " id: " + utilizatori.get(i).getId());
    }
}
