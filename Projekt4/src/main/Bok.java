import java.util.Objects;

public class Bok {

    private String name;
    private String bokNr;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bok bok = (Bok) o;
        return Objects.equals(name, bok.name) &&
                Objects.equals(bokNr, bok.bokNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bokNr);
    }

// Konstruktor


    public Bok(String name, String bokNr) {
        this.name = name;
        this.bokNr = bokNr;

    }


    public String getName() {
        return name;
    }

    public String getBokNr() {
        return bokNr;
    }

    public static Bok createBok(String name, String bokNr) {
        return new Bok(name, bokNr);
    }



}

