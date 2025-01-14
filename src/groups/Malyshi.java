package groups;

import abstractclasses.Group;


public class Malyshi extends Group {
    private boolean flyOnHotAirBaloon;

    public Malyshi() {
        super("Малыши");
    }

    public void setFlyOnHotAirBaloon(boolean flyOnHotAirBaloon) {
        this.flyOnHotAirBaloon = flyOnHotAirBaloon;
    }

    public void checkFlyOnHotAirBaloon() {
        if (flyOnHotAirBaloon) {
            System.out.println("Малыши летали на воздушном шаре");
        } else {
            System.out.println("Малыши никогда не летали на воздушном шаре");
        }
    }

    @Override
    public String toString() {
        return "Малыши";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        } else {
            return true;

        }
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


}
