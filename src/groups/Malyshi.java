package groups;

import abstractclasses.Group;
import abstractclasses.Person;
import objects.Boat;
import objects.River;


public class Malyshi extends Group {
    private boolean flyOnHotAirBaloon;
    public Malyshi() {
        super("Малыши");
    }
    public void setFlyOnHotAirBaloon(boolean flyOnHotAirBaloon){
        this.flyOnHotAirBaloon=flyOnHotAirBaloon;
    }
    public void checkFlyOnHotAirBaloon(){
        if (flyOnHotAirBaloon==true){
            System.out.println("Малыши летали на воздушном шаре");
        }
        else {
            System.out.println("Малыши никогда не летали на воздушном шаре");
        }
    }
    @Override
    public String toString(){
        return "Малыши "+this.getMembers();
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
