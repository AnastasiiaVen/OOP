package Seminar1_OOP;

import java.util.List;

public class Research {

    public static void nameChild(String name, TreeFamily tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPerson1().getName().equals(name) && el.getLink() == Relation.PARENT ) {
                System.out.println(el.getPerson2().getName());
            } 
            // добавить вывод "детей нет"
        }
    }
    
    public static void typeLink(String name1, String name2, TreeFamily tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPerson1().getName().equals(name1) && el.getPerson2().getName().equals(name2) ) {
                System.out.println(el.getLink());
            } 
            
        }
    }
   
    public static void allLink(String name, TreeFamily tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPerson1().getName().equals(name) && el.getLink() != null ) {
                System.out.printf("%s, %s\n", el.getPerson2(), el.getLink());
            } 
        }
    } 
}
