package action;

import objects.Boat;
import objects.River;

public class Swim {
    public static void swim(){
        System.out.println("плыть");
    }

    public static void swim(River river, Boat boat){
        System.out.println("плыть по "+ river.getObjectName().substring(0,river.getObjectName().length()-1)+"е"+" на "+boat.getObjectName()+"х" );
    }
}
