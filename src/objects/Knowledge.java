package objects;


import abstractclasses.Objects;

public class Knowledge extends Objects {
    private String knowledge;
    public Knowledge(String objectname, String knowledge){
        super(objectname);
        this.knowledge=knowledge;
    }
    public String getKnowledge(){
        return knowledge;
    }

}
