package action;

import abstractclasses.Group;
import abstractclasses.Person;

public final class Suggest {
    public static void suggest(Person p, String phrase){
        System.out.println(p.getName()+" предлажил "+phrase);
    }
    public static void suggest(Group p,String phrase ){
        System.out.println(p.getName()+" предлажили "+phrase);
    }
    public static void suggest(String who_sugget, String phrase ){
        System.out.println(who_sugget+" предлагали "+phrase);
    }
}
