package Seminar2_OOP;

public class Program {
    public static void main(String[] args) {
        Person person1 = new FamilyMember("Oleg", "V", 12);
        Person person2 = new FamilyMember("Olga", "V", 40);
        Person person3 = new FamilyMember("Stas", "V", 20);
        Person person4 = new FamilyMember("Nastya", "L", 35);
        Person person5 = new FamilyMember("Vera", "L", 10);
        Person person6 = new FamilyMember("Vlad", "V", 65);
        Person person7 = new FamilyMember("Vlad", "L", 40);


        
        TreeFamily tree = new TreeFamily();
        tree.addLink(person1, person2, Relation.CHILD, Relation.PARENT);
        tree.addLink(person3, person2, Relation.CHILD, Relation.PARENT);
        tree.addLink(person2, person4, Relation.SISTER);
        tree.addLink(person5, person4, Relation.CHILD, Relation.PARENT);
        tree.addLink(person2, person6, Relation.CHILD, Relation.PARENT);
        tree.addLink(person4, person6, Relation.CHILD, Relation.PARENT);
        tree.addLink(person1, person6, Relation.GRANDCHILD, Relation.GRANDPARENT);
        tree.addLink(person3, person6, Relation.GRANDCHILD, Relation.GRANDPARENT);
        tree.addLink(person5, person6, Relation.GRANDCHILD, Relation.GRANDPARENT);
        tree.addLink(person5, person7, Relation.CHILD, Relation.PARENT);


        person1.searchParents(tree);
        // person6.nameChild(tree);
        // person1.typeLink(person6, tree);
        // person6.allLink(tree);
        // System.out.println(tree);
    }
}
