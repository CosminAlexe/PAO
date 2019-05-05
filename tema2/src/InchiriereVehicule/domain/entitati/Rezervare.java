package InchiriereVehicule.domain.entitati;

import java.util.Date;

public class Rezervare {
    private Utilizator utilizator;
    private Vehicul vehicul;
    private Date dataInceput;
    private Date dataFinal;

    public Rezervare(Utilizator utilizator, Automobil automobil, Date dataInceput, Date dataFinal) {
        this.utilizator = utilizator;
        this.vehicul = automobil;
        this.dataInceput = dataInceput;
        this.dataFinal = dataFinal;
    }

    public Rezervare(Utilizator utilizator, Autoutilitara autoutilitara, Date dataInceput, Date dataFinal) {
        this.utilizator = utilizator;
        this.vehicul = autoutilitara;
        this.dataInceput = dataInceput;
        this.dataFinal = dataFinal;
    }

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(Utilizator utilizator) {
        this.utilizator = utilizator;
    }

    public Vehicul getVehicul() {
        return vehicul;
    }

    public void setVehicul(Vehicul vehicul) {
        this.vehicul = vehicul;
    }

    public Date getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(Date dataInceput) {
        this.dataInceput = dataInceput;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
