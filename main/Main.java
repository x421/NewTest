package main;

import classes.Cabinet;
import classes.Office;
import classes.Person;
import classes.Scanner;

public class Main {

    public static void main(String[] args) {
	    Office of = new Office();
	    Cabinet c = new Cabinet("314");
	    c.AddDevice(new Scanner("1", "2"));
	    c.AddEmployee(new Person("1", "2"));
        c.AddEmployee(new Person("3", "4"));
	    of.addCabinet(c);

	    of.PrintAll();
    }
}
