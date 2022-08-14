package Version_2;

import java.util.List;

public abstract class Person implements Research{

    protected String name;
    protected String surname;
    protected int age;
    
    public abstract void searchParents(TreeFamily tree);
    
    @Override
    public void nameChild(TreeFamily tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPerson1().getName().equals(name) && el.getPerson1().getAge() == age && el.getLink() == Relation.PARENT ) {
                System.out.println(el.getPerson2().getName());
            } 
            // добавить вывод "детей нет"
        }
        
    }

    @Override
    public void typeLink(Person person, TreeFamily tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPerson1().getName().equals(name) &&  el.getPerson2() == person) {
                System.out.println(el.getLink());
            } 
            
        }
        
    }

    @Override
    public void allLink(TreeFamily tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPerson1().getName().equals(name) && el.getPerson1().getAge() == age && el.getLink() != null ) {
                System.out.printf("%s, %s\n", el.getPerson2(), el.getLink());
            } 
        }
        
    }

    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "age=" + age + ", name=" + name + ", surname=" + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    
}
