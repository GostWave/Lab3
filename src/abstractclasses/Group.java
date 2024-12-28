package abstractclasses;



import java.util.ArrayList;
import java.util.List;

public abstract class Group {

    private ArrayList<Person> members;
    private ArrayList<String> names;
    private String name;
    public Group(String name){
        this.name=name;
        this.members = new ArrayList<>();
        this.names = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addMemders(Person p){
        members.add(p);
        names.add(p.getName());
    }

    public void removeMembers(int index){
        if (index<0 | index>=members.size()){
            System.out.println("Неверный индекс");
        }
        else {
            members.remove(index);
            names.remove(index);
        }
    }

    public List<String> getMembers() {

        return names;
    }

    public int getAmount(){

        return members.size();
    }
    public abstract void checkFlyOnHotAirBaloon();
    

}
