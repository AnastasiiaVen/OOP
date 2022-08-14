package Seminar2_OOP;

import java.util.List;

public class FamilyMember extends Person{

    public FamilyMember(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void searchParents(TreeFamily tree) {
      
        List<Link> links = tree.getLinks();
        
        for (Link el : links) {
            if (el.getPerson2().getName().equals(name) && el.getLink() == Relation.PARENT) {
                System.out.println(el.getPerson1());
            }
        }
    }

}
