package abstractclasses;

import interfaces.CanDream;
import interfaces.CanListen;
import interfaces.CanSuggest;
import objects.Knowledge;

public abstract class Person implements CanListen,CanSuggest, CanDream {
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
            } else {
                System.out.println("Не знает как " + k.getKnowledge());
            }

        } else {
            System.out.print("Не знает как " + k.getKnowledge() + " ");
        }

    }
    @Override
    public  void suggest(String who_sugget, String phrase ){
        System.out.print(who_sugget+" предлагали "+phrase);
    }
    @Override
    public void listenStory(){
        System.out.print("Слушал историю ");
    }
    @Override
    public void dream(Group p, String phrase) {
        System.out.println(p.getName() + " мечтают о том, " + phrase);

    }
}

