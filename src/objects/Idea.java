package objects;

import abstractclasses.Object;

public class Idea extends Object {
    private String idea;
    public Idea(String objectname,String idea){
        super(objectname);
        this.idea=idea;

    }
    public String idea(){
        return idea;
    }
    public void goodIdea(){
        System.out.println("Эта затея всем очень понравилась.");
    }

}
