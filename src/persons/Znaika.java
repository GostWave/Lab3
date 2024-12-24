package persons;

import abstractclasses.Person;

public final class Znaika extends Person {

    public Znaika(String name,int age) {
        super(name, age);

    }
    @Override
    public String toString(){
        return "Знайка [Возраст: "+this.getAge()+"]";
    }



}
