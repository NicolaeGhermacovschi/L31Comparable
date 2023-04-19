package auto;

import java.util.Objects;

public class Automobil implements Comparable<Automobil> {
    private String denumirea;
    private int anProducere;

    public Automobil(String denumirea, int anProducere) {
        this.denumirea = denumirea;
        this.anProducere = anProducere;
    }

    public String getDenumirea() {
        return denumirea;
    }

    public int getAnProducere() {
        return anProducere;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "denumirea='" + denumirea + '\'' +
                ", anProducere=" + anProducere +
                '}';
    }

    @Override
    public boolean equals(Object o) {
     //   System.out.println("am intrant in equals " + o.toString());
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
 //       System.out.println("iesit din equLAS");
        return anProducere == automobil.anProducere && Objects.equals(denumirea, automobil.denumirea);
    }

    @Override
    public int hashCode() {
   //     System.out.println("am intrat in hascode " + anProducere);
        return Objects.hash(anProducere);

    }

    @Override
    public int compareTo(Automobil o) {
   //     System.out.println("am intrat in compareTO + " + o.toString());
        if (this.equals(o))
            return 0;
        if (anProducere < o.anProducere)
            return -1;
  //      System.out.println("iesti din compareTo");
        return 1;
    }
}
