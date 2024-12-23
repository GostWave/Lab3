package objects;

import abstractclasses.Object;

public class Knowledge extends Object {
    private String knowledge;
    public Knowledge(String objectname, String knowledge){
        super(objectname);
        this.knowledge=knowledge;
    }
    public String getKnowledge(){
        return knowledge;
    }

}
