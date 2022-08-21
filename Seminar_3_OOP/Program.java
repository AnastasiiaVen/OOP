package Seminar_3_OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<FamilyMember> fm = new ArrayList<>();
        fm.add(new FamilyMember("Oleg", "V", 12));
        fm.add(new FamilyMember("Olga", "V", 40));
        fm.add(new FamilyMember("Stas", "V", 20));
        fm.add(new FamilyMember("Nastya", "L", 35));
        fm.add(new FamilyMember("Vera", "L", 10));
        fm.add(new FamilyMember("Vlad", "V", 65));
        System.out.println(fm);

        fm.sort(new AgeComporatorPlus());
        System.out.println(fm);

        fm.sort(new AgeComparatorMinus());
        System.out.println(fm);

        fm.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(fm);

        fm.sort(new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        System.out.println(fm);

    }
}
