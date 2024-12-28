package objects;


import abstractclasses.Objects;
import interfaces.Property;

public class HotAirBaloon extends Objects implements Property {
    private int size;
    private String color;
    private String material;
    public HotAirBaloon(String objectname,int size, String color,String material){
        super(objectname);
        this.size=size;
        this.color=color;
        this.material=material;
    }

    @Override
    public void getProperty(){
        System.out.println( "Размер шара: "+size+" Цвет: "+color+" Материал: "+material);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        } else {
            return true;

        }
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
