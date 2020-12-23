package classes;

import abstracts.Device;
import abstracts.Numerable;
import interfaces.Printable;

import java.util.LinkedList;

public class Cabinet extends Numerable implements Printable {
    private Device dev;
    private LinkedList<Person> employeeList;

    public Cabinet(String id){
        super(id);
        employeeList = new LinkedList<>();
    }

    public void AddDevice(Device dev) {
        this.dev = dev;
    }

    public void AddEmployee(Person p) {
        employeeList.add(p);
    }

    @Override
    public void PrintAll() {
        System.out.println("Cabinet id: "+id+".\nDevice is: "+dev.name+", id: "+dev.id+", status: "+dev.status+". Employee list: ");

        for (Person p : employeeList) {
            p.PrintAll();
        }
    }
}
