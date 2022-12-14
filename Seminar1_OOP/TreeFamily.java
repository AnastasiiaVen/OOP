package Seminar1_OOP;

import java.util.ArrayList;
import java.util.List;

public class TreeFamily {
    private List<Link> links = new ArrayList<>();

    public void addLink(Person p1, Person p2, Relation link1, Relation link2) {
        Link l1 = new Link(p1, p2, link1);
        Link l2 = new Link(p2, p1, link2);

        links.add(l1);
        links.add(l2);
    }
    public void addLink(Person p1, Person p2, Relation link) {
        this.addLink(p1, p2, link, link);
    }

    public List<Link> getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "TreeFamily [links=" + links + "]";
    }

    
}

