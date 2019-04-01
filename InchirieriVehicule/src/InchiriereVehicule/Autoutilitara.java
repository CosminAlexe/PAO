package InchiriereVehicule;

import java.util.Scanner;

public class Autoutilitara extends Vehicul {
    private int masa;
    private int costPeZi;

    public Autoutilitara(String marca, String model, int anFabricatie, int rulajl, int nrLocuri, String combustibil, int capacitateCilindrica, int putere, int id, int masa, int costPeZi) {
        super(marca, model, anFabricatie, rulajl, nrLocuri, combustibil, capacitateCilindrica, putere, id);
        this.masa = masa;
        this.costPeZi = costPeZi;
    }

    public Autoutilitara() {
        super();
        this.masa = 0;
        this.costPeZi = 0;

    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getCostPeZi() {
        return costPeZi;
    }

    public void setCostPeZi(int costPeZi) {
        this.costPeZi = costPeZi;
    }

    void AdaugaAutoutilitara(int id){
        super.AdaugaVehicul(id);
        Scanner cin = new Scanner(System.in);

        int masa;
        System.out.println("Masa: ");
        masa = cin.nextInt();
        this.masa = masa;

        int cost;
        System.out.println("Costul pe zi: ");
        cost = cin.nextInt();
        this.costPeZi = cost;
    }

    void AfisareAutoutilitara(){
        super.AfisareVehicul();
        System.out.println("Masa: " + this.masa);
        System.out.println("Csotul pe zi: " + this.costPeZi + " lei");
        System.out.println("----------------------------------------------------------");
    }

}
