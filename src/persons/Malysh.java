package persons;

import abstractclasses.Person;

public class Malysh extends Person {

    public Malysh(String name, int age) {
        super(name,age);
    }
    @Override
    public String toString(){
        return "Малыш [Имя: "+this.getName()+", Возраст: "+this.getAge()+"]";
    }

}
