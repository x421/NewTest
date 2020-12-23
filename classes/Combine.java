package classes;

import abstracts.Device;

public class Combine extends Device {
    public Combine(String name, String id){
        super(name, id);
    }

    @Override
    public void Work(){
        System.out.println("Combine prints");
    }

}