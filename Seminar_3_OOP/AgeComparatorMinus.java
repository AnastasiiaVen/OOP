package Seminar_3_OOP;

import java.util.Comparator;

public class AgeComparatorMinus implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getAge() - o1.getAge();
    }

}
