package Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

//dlaczeko;
    //w każdym razie, jeśli odwrócić miejscami 1 i -1, to będzie od najstarszego do najmłodszego.
    public int compare(Person a, Person b) {
        if (a.getAge() > b.getAge()) {
            return 1;
        }
        if (a.getAge() == b.getAge()) {
            return 0;
        }
        if (a.getAge() < b.getAge()) {
            return -1;
        }
        return 0;
    }
}
