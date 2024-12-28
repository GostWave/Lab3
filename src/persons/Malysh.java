package persons;

import abstractclasses.Person;

public class Malysh extends Person {

    public Malysh(String name, int age) {
        super(name,age);
    }
    @Override
    public String toString(){
        return "Малыш [Имя: "+this.getName()+", Возраст: "+this.getAge()+"]";
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

