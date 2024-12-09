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
    public void Say(String text){
        System.out.print(this.getName()+" сказал: "+text);
    }
}
