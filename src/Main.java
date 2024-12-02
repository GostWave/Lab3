
import action.Dream;
import enums.BoatType;
import groups.Malyshi;
import objects.Boat;
import objects.River;
import persons.Human;
import persons.Znaika;
import action.*;
public class Main {
    public static void main(String[] args) {
        Znaika znaika = new persons.Znaika();

        Malyshi malyshi = new Malyshi();
        malyshi.addMemders(new Human("malysh1") );
        malyshi.addMemders(new Human("malysh2") );

        Listen.listen();
        Dream.dream(malyshi,"как бы отправиться в путешествие");
        GoHiking hiking = new GoHiking();
        Suggest.suggest("Некоторые", hiking.message());
        System.out.println();
        River river = new River("река");

        Boat boat = new Boat("лодка", BoatType.KAYAK,250,85);
        Suggest.suggest("Другие",Swim.swimMessage());
        System.out.print(" по "+river.getObjectName()+" на " +boat.getObjectName());







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