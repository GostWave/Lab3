
import Action.Dream;
import Groups.Malyshi;
import Objects.Boat;
import Objects.River;
import Persons.Human;
import Persons.Znaika;
import Action.*;
public class Main {
    public static void main(String[] args) {
        Znaika znaika = new Persons.Znaika();

        Malyshi malyshi = new Malyshi();
        malyshi.addMemders(new Human("malysh1") );
        malyshi.addMemders(new Human("malysh2") );

        Listen.listen();
        Dream.dream(malyshi,"как бы отправиться в путешествие");
        GoHiking hiking = new GoHiking();
        Suggest.suggest("Некоторые", hiking.message());
        River river = new River("река");
        System.out.println(river.getObjectName());
        Boat boat = new Boat("лодка");
        System.out.println(boat.getObjectName());






//        Malyshi malyshi = new Malyshi();
//        System.out.println(malyshi.getName());
//        malyshi.addMemders(new Human("lol") );
//        malyshi.addMemders(new Human("kek") );
//        malyshi.addMemders(new Human("kek") );
//        malyshi.addMemders(new Human("kek") );
//        Human a=new Human("aba");
//        a.setName("lala");
//        malyshi.addMemders(a);
//
//        System.out.println(malyshi.getMembers());
//        System.out.println(malyshi.getAmount());
//
//        malyshi.removeMembers(2);
//        malyshi.removeMembers(1);
//
//
//        System.out.println(malyshi.getMembers());
//        System.out.println(malyshi.getAmount());

    }
}