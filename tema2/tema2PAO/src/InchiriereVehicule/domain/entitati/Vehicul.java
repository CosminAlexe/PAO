package InchiriereVehicule.domain.entitati;

import java.util.Scanner;

public abstract class Vehicul {
    protected String marca;
    protected String model;
    protected int anFabricatie;
    protected int rulajl;
    protected int nrLocuri;
    protected String combustibil;
    protected int capacitateCilindrica;
    protected int putere;
    protected int id ;

    public Vehicul(String marca, String model, int anFabricatie, int rulajl, int nrLocuri, String combustibil, int capacitateCilindrica, int putere, int id) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.rulajl = rulajl;
        this.nrLocuri = nrLocuri;
        this.combustibil = combustibil;
        this.capacitateCilindrica = capacitateCilindrica;
        this.putere = putere;
        this.id = id;
    }

    public Vehicul() {
        marca = null;
        model = null;
        anFabricatie = 0;
        rulajl = 0;
        nrLocuri = 0;
        combustibil = null;
        capacitateCilindrica = 0;
        putere = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public int getRulajl() {
        return rulajl;
    }

    public void setRulajl(int rulajl) {
        this.rulajl = rulajl;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public int getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(int capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void AdaugaVehicul(int id){
        Scanner cin = new Scanner(System.in);

        this.id = id;

        String marca;
        System.out.println("Marca: ");
        marca = cin.nextLine();
        this.marca = marca;

        String model;
        System.out.println("Model: ");
        model = cin.nextLine();
        this.model = model;

        String combustibil;
        System.out.println("Combustibil: ");
        combustibil = cin.nextLine();
        this.combustibil = combustibil;

        int anFabricatie;
        System.out.println("An Fabricatie: ");
        anFabricatie = cin.nextInt();
        this.anFabricatie = anFabricatie;

        int rulaj;
        System.out.println("Rulaj: ");
        rulaj = cin.nextInt();
        this.rulajl = rulaj;

        int nrLocuri;
        System.out.println("Nr Locuri: ");
        nrLocuri = cin.nextInt();
        this.nrLocuri = nrLocuri;

        int cap;
        System.out.println("Capacitate cilindrica: ");
        cap = cin.nextInt();
        this.capacitateCilindrica = cap;

        int putere;
        System.out.println("Putere: ");
        putere = cin.nextInt();
        this.putere = putere;
    }

    public void AfisareVehicul(){
        System.out.println("Id: " + this.id);
        System.out.println("Marca: " + this.marca);
        System.out.println("Model: " + this.model);
        System.out.println("An Fabricatie: " + this.anFabricatie);
        System.out.println("Rulaj: " + this.rulajl);
        System.out.println("Nr locuri; " + this.nrLocuri);
        System.out.println("Combustibil: " + this.combustibil);
        System.out.println("Capacitate cilindrica: " + this.capacitateCilindrica + "cm cubi");
        System.out.println("Putere: " + this.putere + "cp");
    }
}
