package Persons;

import AbstractClasses.Person;

public class Znaika extends Person {
    public Znaika() {
        super("Знайка");

    }
    public String Say(String text){
        return this.getName()+" сказал: "+text;
    }
}
