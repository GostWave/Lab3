package abstractclasses;

public abstract class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String Say(String text){
        return this.getName()+" сказал: "+text;
    }
}
