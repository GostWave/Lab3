package lab3;

import enums.BoatType;
import exception.NotAllowableSizeException;
import groups.Malyshi;
import objects.*;
import persons.Malysh;
import persons.Znaika;


public class Main {
    public static void main(String[] args) {

        Znaika znaika = new Znaika("Знайка", 12);
        // анонимный класс
        Malyshi malyshi = new Malyshi() {
            @Override
            public void listenStory() {
                System.out.print("Наслушавшись таких историй, ");
            }
        };


        malyshi.addMemders(new Malysh("malysh1", 5));
        malyshi.addMemders(new Malysh("malysh2", 7));
        malyshi.addMemders(new Malysh("malysh3", 6));
        // проверяемое исключение
        try {
            malyshi.removeMembers(3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Неверный индекс");
        }

        // 1 сточка
        malyshi.listenStory();
        malyshi.dream(malyshi, "как бы отправиться в путешествие");

        // 2 строчка

        River river = new River("река");
        Boat boat = new Boat("лодка", BoatType.KAYAK);
        try {
            boat.setSize(100, 150);
        } catch (NotAllowableSizeException e) {
            System.out.println(e.getMessage());
        }


        malyshi.suggest("Некоторые", malyshi.goHiking());
        malyshi.suggest(" другие", malyshi.swim(river, boat));


        // 3 строчка
        Idea idea = new Idea("Давайте сделаем воздушный шар и полетим на шаре");
        znaika.Say(idea.idea());
        HotAirBaloon hotAirBaloon = new HotAirBaloon("воздушный шар", 5, "Жёлтый", "резина");
        Ticket ticket = new Ticket(malyshi.getName(), (int) (Math.random() * 100));


        // 4 строчка
        idea.goodIdea();

        // 5 строчка

        malyshi.checkFlyOnHotAirBaloon();

        // 6 строчка
        Knowledge makeHotAirBaloon = new Knowledge("делать воздушные шары");
        System.out.print("Никто ");
        znaika.checkKnowledge(makeHotAirBaloon);
        znaika.Say(" что он все обдумает и тогда объяснит.");

        malyshi.getMembers();

    }
}