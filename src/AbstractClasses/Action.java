package AbstractClasses;

public abstract class Action {
    private String actionname;
    public Action(String actionname){
        this.actionname=actionname;
    }

    public String getActionname() {
        return actionname;
    }
}
