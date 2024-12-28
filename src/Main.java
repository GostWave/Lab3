
import action.Dream;
import enums.BoatType;
import groups.Malyshi;
import objects.*;
import persons.Malysh;
import persons.Znaika;
import action.*;


public class Main {
    public static void main(String[] args) {

        Znaika znaika = new persons.Znaika("Знайка", 12);
        Malyshi malyshi = new Malyshi();

        malyshi.addMemders(new Malysh("malysh1", 5));
        malyshi.addMemders(new Malysh("malysh2", 7));

        // 1 сточка
        Listen.listenHistory();
        Dream.dream(malyshi, "как бы отправиться в путешествие");

        // 2 строчка
        GoHiking hiking = new GoHiking();
        River river = new River("река");
        Boat boat = new Boat("лодка", BoatType.KAYAK);
        boat.setSize(150, 100);


        Suggest.suggest("Некоторые", hiking.message());
        Suggest.suggest(" другие");
        Swim.swim(river, boat);

        // 3 строчка
        Idea idea = new Idea("Сделать воздушный шар", "Давайте сделаем воздушный шар и полетим на шаре");
        znaika.Say(idea.idea());
        HotAirBaloon hotAirBaloon = new HotAirBaloon("воздушный шар", 5, "Жёлтый", "резина");
        Ticket ticket = new Ticket(malyshi.getName(), 52);

        // 4 строчка
        idea.goodIdea();

        // 5 строчка

        malyshi.checkFlyOnHotAirBaloon();

        // 6 строчка
        Knowledge makeHotAirBaloon = new Knowledge("MakeHotAirBaloon", "делать воздушные шары");
        System.out.print("Никто ");
        znaika.checkKnowledge(makeHotAirBaloon);
        znaika.Say(" что он все обдумает и тогда объяснит.");


    }
}