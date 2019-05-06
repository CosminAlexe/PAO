package InchiriereVehicule.domain.entitati;

import java.util.Scanner;

public class Camion extends Vehicul {
    private int masa;
    private int costPeZi;
    private String categorie;

    public Camion(String marca, String model, int anFabricatie, int rulajl, int nrLocuri, String combustibil, int capacitateCilindrica, int putere, int id, int masa, int costPeZi, String categorie) {
        super(marca, model, anFabricatie, rulajl, nrLocuri, combustibil, capacitateCilindrica, putere, id);
        this.masa = masa;
        this.costPeZi = costPeZi;
        this.categorie = categorie;
    }

    public Camion() {
        super();
        this.masa = 0;
        this.costPeZi = 0;
        this.categorie = null;

    }

    @Override
    public String toString() {
        return marca + "," + model + "," + anFabricatie + "," + rulajl + "," + nrLocuri + "," + combustibil + "," +capacitateCilindrica + "," + putere + "," + id + "," + masa + "," + costPeZi + "," + categorie ;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void AdaugaCamion(int id){
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

        cin.nextLine();
        String categorie;
        System.out.println("Categorie: ");
        categorie = cin.nextLine();
        this.categorie = categorie;
    }

    public void AfisareCamion(){
        super.AfisareVehicul();
        System.out.println("Masa: " + this.masa);
        System.out.println("Csotul pe zi: " + this.costPeZi + " lei");
        System.out.println("Categoria necesara: " + this.categorie);
        System.out.println("----------------------------------------------------------");
    }
}

