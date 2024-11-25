
import Groups.Malyshi;
import Persons.Human;
import Persons.Znaika;

public class Main {
    public static void main(String[] args) {
        Znaika znaika = new Persons.Znaika();
        System.out.println(znaika.Say("Привет!"));
        Malyshi malyshi = new Malyshi();
        System.out.println(malyshi.getName());
        malyshi.addMemders(new Human("lol") );
        malyshi.addMemders(new Human("kek") );
        malyshi.addMemders(new Human("kek") );
        malyshi.addMemders(new Human("kek") );
        Human a=new Human("aba");
        a.setName("lala");
        malyshi.addMemders(a);

        System.out.println(malyshi.getMembers());
        System.out.println(malyshi.getAmount());

        malyshi.removeMembers(2);
        malyshi.removeMembers(1);


        System.out.println(malyshi.getMembers());
        System.out.println(malyshi.getAmount());

    }
}