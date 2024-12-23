package abstractclasses;

import objects.Knowledge;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private int age;
    private Knowledge knowledge;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void Say(String text) {
        System.out.println(this.getName() + " сказал: " + text);
    }

    public void setKnowledge(Knowledge k) {
        this.knowledge = k;
    }

    public String getKnowledge() {
        return knowledge.getKnowledge();
    }

    public void checkKnowledge(Knowledge k) {
        if (knowledge != null) {
            if (k.getKnowledge() == knowledge.getKnowledge()) {
                System.out.println("Знает как " + k.getKnowledge());
            }
            else {
                System.out.println("Не знает как " + k.getKnowledge());
            }

        }
        else {
            System.out.print("Не знает как " + k.getKnowledge()+" ");
        }

    }
}
