package objects;

import abstractclasses.Object;
import enums.BoatType;
import interfaces.Property;

import java.lang.reflect.Type;

public class Boat extends Object implements Property {
    private BoatType type;
    private int length;
    private int width;
    public Boat(String objectname, BoatType type, int length, int width){
        super(objectname);
        this.type=type;
        this.length=length;
        this.width=width;
    }

    public BoatType getType() {
        return type;
    }

    public void setType(BoatType type) {
        this.type = type;
    }

    public String getSize(){
        return "Длина: "+length+" ширина: "+width;
    }
    @Override
    public void getProperty(){
        System.out.println("Тип: "+type+" длина: "+ length + " ширина: "+width);
    }
}
