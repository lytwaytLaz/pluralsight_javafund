package se.lexicon.plural.jfun.bookbag;

/**
 * Created by Elev1 on 2016-06-02.
 */
public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    protected boolean[] isSeatAvailable; // protected so I can reach it within package
    {
        isSeatAvailable = new boolean[seats];
        for(int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }
    public Flight() {
    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

}
