package se.lexicon.plural.jfun.bookbag;

/**
 * Created by Elev1 on 2016-06-02.
 */
public class Main {
    public static void main(String[] args) {
        Flight flajt = new Flight(23);
        System.out.printf(String.valueOf(flajt.isSeatAvailable[0]));
    }
}
