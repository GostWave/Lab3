package Action;


import AbstractClasses.Group;
import AbstractClasses.Person;

public final class GoHiking {
    private String participants;
    public GoHiking(Person p){
        this.participants=p.getName();
    }
    public GoHiking(Group p){
        this.participants=p.getName();
    }
    public GoHiking(){
        this.participants="";
    }

    public String  message(){
        return participants+"совершить пеший поход";
    }
}
