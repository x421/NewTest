package abstracts;

public abstract class Device extends Numerable {
    public Boolean status;
    public String name;

    public Device(String name, String id){
        super(id);
        this.name = name;
        status = false;
    }

    public abstract void Work();

    public void Switch(){
        status = !status;
        System.out.println("Device name: "+name+" id: "+id+" status: "+status);
    }

}
