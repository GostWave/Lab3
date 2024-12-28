package objects;


import abstractclasses.Objects;

public class Idea {
    private String idea;
    public Idea(String idea){

        this.idea=idea;

    }
    public String idea(){
        return idea;
    }
    public void goodIdea(){
        System.out.println("Эта затея всем очень понравилась.");
    }

}
