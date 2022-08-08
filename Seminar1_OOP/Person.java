package Seminar1_OOP;

public class Person {

    private String name;
    private String surname;
    private int age;
    
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
