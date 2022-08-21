package Seminar_3_OOP;

public abstract class Person {
    protected String name;
    protected String surname;
    protected int age;
    
    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return " " + age + " " + name + " " + surname;
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
