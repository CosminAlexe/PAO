package InchiriereVehicule.domain.entitati;

public class Utilizator {
    private int id;
    private String nume;
    private String email;

    public Utilizator(int id, String nume, String email) {
        this.id = id;
        this.nume = nume;
        this.email = email;
    }

    public Utilizator() {
        id = 0;
        nume = null;
        email = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
