package action;

import abstractclasses.Group;
import abstractclasses.Person;

public final class Suggest {
    public static void suggest(Person p, String phrase){
        System.out.print(p.getName()+" предложил "+phrase);
    }
    public static void suggest(Group p,String phrase ){
        System.out.print(p.getName()+" предложили "+phrase);
    }
    public static void suggest(String who_sugget, String phrase ){
        System.out.print(who_sugget+" предлагали "+phrase);
    }
    public static void suggest(String who_sugget ){
        System.out.print(who_sugget+" предлагали ");
    }
}
