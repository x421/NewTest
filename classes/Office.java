package classes;

import classes.Cabinet;
import interfaces.Printable;

import java.util.LinkedList;

public class Office implements Printable {
    private LinkedList<Cabinet> cabinets;

    public Office() {
        cabinets = new LinkedList<Cabinet>();
    }

    public void addCabinet(Cabinet c) {
        cabinets.add(c);
    }


    @Override
    public void PrintAll() {
        var it = cabinets.iterator();

        while(it.hasNext()) {
            Cabinet c = it.next();
            c.PrintAll();
        }
    }
}
