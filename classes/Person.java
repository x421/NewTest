package classes;

import abstracts.Numerable;
import interfaces.Printable;

public class Person extends Numerable implements Printable {
    public String name;

    public Person(String id, String name){
        super(id);
        this.name = name;
    }

    @Override
    public void PrintAll() {
        System.out.println("Person: "+name+" id: "+id);
    }
}
