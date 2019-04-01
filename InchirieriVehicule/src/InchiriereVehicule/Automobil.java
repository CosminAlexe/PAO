package InchiriereVehicule;

import java.util.Scanner;

public class Automobil extends Vehicul {
    private String clasa;
    private int costPeZi;

    public Automobil(String marca, String model, int anFabricatie, int rulajl, int nrLocuri, String combustibil, int capacitateCilindrica, int putere, int id, String clasa, int costPeZi) {
        super(marca, model, anFabricatie, rulajl, nrLocuri, combustibil, capacitateCilindrica, putere, id);
        this.clasa = clasa;
        this.costPeZi = costPeZi;
    }

    public Automobil() {
        super();
        this.clasa = null;
        this.costPeZi = 0;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public int getCostPeZi() {
        return costPeZi;
    }

    public void setCostPeZi(int costPeZi) {
        this.costPeZi = costPeZi;
    }

    void AdaugareAutomobil(int id){
        super.AdaugaVehicul(id);
        Scanner cin = new Scanner(System.in);

        String clasa;
        System.out.println("Clasa: ");
        clasa = cin.nextLine();
        this.clasa = clasa;

        int cost;
        System.out.println("Costul pe zi: ");
        cost = cin.nextInt();
        this.costPeZi = cost;
    }

    void AfisareAutomobil(){
        super.AfisareVehicul();
        System.out.println("Clasa: " + this.clasa);
        System.out.println("Costul pentru fiecare zi: " + this.costPeZi + " lei");
        System.out.println("------------------------------------------------------------------");
    }

}

