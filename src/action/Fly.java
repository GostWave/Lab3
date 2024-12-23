package action;

import abstractclasses.Group;
import abstractclasses.Person;
import groups.Malyshi;

public class Fly  {
    public static void fly(Person p){
        System.out.println(p.getName()+" летит");
    }
    public static void flyOnHotAirBaloon(Malyshi m){
        m.setFlyOnHotAirBaloon(true);
    }

}
