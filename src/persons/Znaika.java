package persons;

import abstractclasses.Person;

public final class Znaika extends Person {

    public Znaika(String name,int age) {
        super(name, age);

    }
    @Override
    public String toString(){
        return "Знайка [Возраст: "+this.getAge()+"]";
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
