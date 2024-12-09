
import action.Dream;
import enums.BoatType;
import groups.Malyshi;
import objects.Boat;
import objects.HotAirBaloon;
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

        // 1 сточка
        Listen.listenHistory();
        Dream.dream(malyshi,"как бы отправиться в путешествие");
        // 2 строчка
        GoHiking hiking = new GoHiking();
        River river = new River("река");
        Boat boat = new Boat("лодка", BoatType.KAYAK,250,85);
        Suggest.suggest("Некоторые", hiking.message());
        Suggest.suggest(" другие");
        Swim.swim(river,boat);

        // 3 строчка
        HotAirBaloon hotAirBaloon = new HotAirBaloon("воздушный шар",5,"Жёлтый","резина");
        znaika.Say("Давайте сделаем "+ hotAirBaloon.getObjectName()+" и ");
        FlyOnHotAirBaloon.fly();









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