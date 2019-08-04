package pl.krystian;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()
public class SettersGetters {
    @Id
    int id;
    private String marka;
    private int przebieg;
    private int rocznik;

    public void setId(int id) {
        this.id = id;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public int getRocznik() {
        return rocznik;
    }

    public int getPrzebieg() {
        return przebieg;
    }
}
