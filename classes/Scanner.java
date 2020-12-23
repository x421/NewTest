package classes;

import abstracts.Device;

public class Scanner extends Device {
    public Scanner(String name, String id){
        super(name, id);
    }

    @Override
    public void Work(){
        System.out.println("Scanner scans");
    }
}
