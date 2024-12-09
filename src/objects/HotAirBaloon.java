package objects;

import abstractclasses.Object;
import interfaces.Property;

public class HotAirBaloon extends Object implements Property {
    private int size;
    private String color;
    private String material;
    public HotAirBaloon(String objectname,int size, String color,String material){
        super(objectname);
        this.size=size;
        this.color=color;
        this.material=material;
    }
    public String fly(){
        return "лететь на воздушном шаре";
    }
    @Override
    public void getProperty(){
        System.out.println( "Размер шара: "+size+" Цвет: "+color+" Материал: "+material);
    }

}
