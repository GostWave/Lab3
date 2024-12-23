package objects;


import abstractclasses.Objects;
import enums.BoatType;
import exception.NotAllowableBoatSize;
import interfaces.Property;

import java.lang.reflect.Type;

public class Boat extends Objects implements Property {
    private BoatType type;
    private int length;
    private int width;
    public Boat(String objectname, BoatType type){
        super(objectname);
        this.type=type;

    }
    public void setSize(int length,int width){
        try {
            if (length<width){
                throw new NotAllowableBoatSize("Неверные данные","неверные размеры лодки");
            }
        } catch (NotAllowableBoatSize e){
            System.out.println(e.getMessage());
        }
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;

    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
