package AbstractClasses;

public abstract class Object {
    private String objectname;
    public Object(String objectname){
        this.objectname=objectname;
    }

    public String getObjectName() {
        return objectname;
    }
}

