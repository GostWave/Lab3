package groups;

import abstractclasses.Group;


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


}
