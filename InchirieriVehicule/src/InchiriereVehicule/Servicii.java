package InchiriereVehicule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicii {

    private static int counterUt = 0;
    private static int counterVehicule = 0;

    public void addAutomobil(ArrayList<Automobil> automobile){
        Automobil a = new Automobil();
        counterVehicule++;
        a.AdaugareAutomobil(counterVehicule);
        automobile.add(a);
    }

    public void addAutoutilitara(ArrayList<Autoutilitara> autoutilitare){
        Autoutilitara a = new Autoutilitara();
        counterVehicule++;
        a.AdaugaAutoutilitara(counterVehicule);
        autoutilitare.add(a);
    }

    public void afisareAutomobile(ArrayList<Automobil> automobile){
        for(int i = 0 ; i < automobile.size(); i++)
            automobile.get(i).AfisareAutomobil();
    }

    public void afisareAutoutilitare(ArrayList<Autoutilitara> autoutilitare){
        for(int i = 0 ; i < autoutilitare.size(); i++)
            autoutilitare.get(i).AfisareAutoutilitara();
    }

    public void addUtilizator(ArrayList<Utilizator> utilizatori){
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

    public void afisareUtilizatori(ArrayList<Utilizator> utilizatori){
        for(int i = 0; i < utilizatori.size(); i++ )
            System.out.println( "Nume: " + utilizatori.get(i).getNume() + " e-mail: " + utilizatori.get(i).getEmail() + " id: " + utilizatori.get(i).getId());
    }
    public void addRezervare(ArrayList<Rezervare> rezervari, ArrayList<Automobil> automobile, ArrayList<Autoutilitara> autoutilitare, ArrayList<Utilizator> utilizatori) {
        Scanner cin = new Scanner(System.in);

        Autoutilitara aa = new Autoutilitara();
        Automobil a =new Automobil();
        int ut, aut, verf = 1, autou = 0, auto = 0;
        Date inceput;
        Date sfarsit;
        Utilizator u = new Utilizator();

        System.out.println("Dati Id-ul utilizatorului: ");
        ut = cin.nextInt();
        for (int i = 0; i < utilizatori.size(); i++)
            if (utilizatori.get(i).getId() == ut) {
                u = utilizatori.get(i);
                verf = 0;
                break;
            }

        System.out.println("Dati id-ul vehiculului: ");
        aut = cin.nextInt();
        if (verf == 0) {
            verf = 1;
            for (int i = 0; i < automobile.size(); i++)
                if (automobile.get(i).getId() == aut) {
                    a = automobile.get(i);
                    auto++;
                    verf = 0;
                    break;
                }
        }
        if (verf == 1) {
            for (int i = 0; i < autoutilitare.size(); i++)
                if (autoutilitare.get(i).getId() == aut) {
                    aa = autoutilitare.get(i);
                    autou++;
                    verf = 0;
                    break;
                }
        }
        if (verf == 1)
                System.out.println("Nu exista acest vehicul!");

        Date d;
        String s;
        System.out.println("Dati data de inceput: ");
        s = cin.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date da = sdf.parse(s);
            inceput = da;
        } catch (ParseException e){
            e.printStackTrace();
            inceput = null;
        }

        Date dd;
        String ss;
        System.out.println("Dati data de sfarsit: ");
        ss = cin.nextLine();
        SimpleDateFormat sdff = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date daa = sdff.parse(s);
            sfarsit = daa;
        } catch (ParseException e){
            e.printStackTrace();
            sfarsit = null;
        }


        if (sfarsit.after(inceput) || sfarsit == null || inceput == null) {
            verf = 1;
            System.out.println("A fost introdus gresit intervalul orar!");
        } else if (verf == 0)
            for (int i = 0; i < rezervari.size(); i++)
                if (rezervari.get(i).getVehicul() == a && (rezervari.get(i).getDataInceput().before(inceput) && rezervari.get(i).getDataFinal().after(inceput)) || (rezervari.get(i).getDataInceput().before( sfarsit) && rezervari.get(i).getDataFinal().after(sfarsit)))
                    verf = 1;

        if (verf == 0) {
            if(auto == 1) {
                Rezervare r = new Rezervare(u, a, inceput, sfarsit);
                rezervari.add(r);
            }
            if(autou == 1){
                Rezervare r = new Rezervare(u, aa, inceput, sfarsit);
                rezervari.add(r);
            }
        }
    }

    public void afisareRezervari(ArrayList<Rezervare> rezervari){
        for(int i = 0; i < rezervari.size(); i++)
            System.out.println("vehiculul: " + rezervari.get(i).getVehicul().getId() + " a fost rezervat de utilizatorul: " + rezervari.get(i).getUtilizator().getId() + " de la " + rezervari.get(i).getDataInceput() + " pana la " + rezervari.get(i).getDataFinal());

    }

}
