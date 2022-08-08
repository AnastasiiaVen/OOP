package Seminar1_OOP;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person("Oleg", "V", 12);
        Person person2 = new Person("Olga", "V", 40);
        Person person3 = new Person("Stas", "V", 20);
        Person person4 = new Person("Nastya", "L", 35);
        Person person5 = new Person("Vera", "L", 10);
        Person person6 = new Person("Vlad", "V", 65);

        
        TreeFamily tree = new TreeFamily();
        tree.addLink(person1, person2, Seminar1_OOP.Relation.CHILD, Seminar1_OOP.Relation.PARENT);
        tree.addLink(person3, person2, Seminar1_OOP.Relation.CHILD, Seminar1_OOP.Relation.PARENT);
        tree.addLink(person2, person4, Seminar1_OOP.Relation.SISTER);
        tree.addLink(person5, person4, Seminar1_OOP.Relation.CHILD, Seminar1_OOP.Relation.PARENT);
        tree.addLink(person2, person6, Seminar1_OOP.Relation.CHILD, Seminar1_OOP.Relation.PARENT);
        tree.addLink(person4, person6, Seminar1_OOP.Relation.CHILD, Seminar1_OOP.Relation.PARENT);
        tree.addLink(person1, person6, Seminar1_OOP.Relation.GRANDCHILD, Seminar1_OOP.Relation.GRANDPARENT);
        tree.addLink(person3, person6, Seminar1_OOP.Relation.GRANDCHILD, Seminar1_OOP.Relation.GRANDPARENT);
        tree.addLink(person5, person6, Seminar1_OOP.Relation.GRANDCHILD, Seminar1_OOP.Relation.GRANDPARENT);


        // Research.nameChild("Olga", tree);
        // Research.typeLink("Oleg", "Vlad", tree);
        Research.allLink("Vlad", tree);
        // System.out.println(tree);
    }
}
