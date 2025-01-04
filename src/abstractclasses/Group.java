package abstractclasses;



import groups.Malyshi;
import interfaces.*;
import objects.Boat;
import objects.River;

import java.util.ArrayList;
import java.util.List;

public abstract class Group implements CanSuggest, CanListen, CanDream, CanFlyOnHotAirBaloon, CanGoHiking, CanSwim {

    private ArrayList<Person> members;
    private ArrayList<String> names;
    private String name;

    public Group(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.names = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMemders(Person p) {
        members.add(p);
        names.add(p.getName());
    }

    public void removeMembers(int index) {
        if (index < 0 | index >= members.size()) {
            System.out.println("Неверный индекс");
        } else {
            members.remove(index);
            names.remove(index);
        }
    }

    public ArrayList<String> getMembers() {
        class printMembers{
            final ArrayList<String> memberNames=Group.this.names;
            void print(){
                System.out.println(memberNames);
            }
        }
        return names;
    }

    public int getAmount() {

        return members.size();
    }

    public abstract void checkFlyOnHotAirBaloon();

    @Override
    public void suggest(String who_suggest, String phrase) {
        System.out.print(who_suggest + " предлагали " + phrase);
    }

    @Override
    public void listenStory() {
        System.out.print("Слушали историю");
    }

    @Override
    public void dream(Group p, String phrase) {
        System.out.println(p.getName() + " мечтают о том, " + phrase);

    }
    @Override
    public void flyOnHotAirBaloon(Malyshi m){
        m.setFlyOnHotAirBaloon(true);
    }
    @Override
    public String  goHiking(){
        return "совершить пеший поход";
    }
    @Override
    public String  swim(River river, Boat boat){
        return "плыть по "+ river.getObjectName().substring(0,river.getObjectName().length()-1)+"е"+" на "+boat.getObjectName()+"х" +"\n";
    }
}
