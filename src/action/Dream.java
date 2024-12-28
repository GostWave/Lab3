package action;


import abstractclasses.Group;
import abstractclasses.Person;


public final class Dream  {

    public static void dream(Person p, String phrase){
        System.out.println(p.getName()+" мечтает о том"+phrase);
    }
    public static void dream(Group p, String phrase){
        System.out.println(p.getName()+" мечтают о том, "+phrase);
    }


}
