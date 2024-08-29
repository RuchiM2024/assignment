package Concept;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public Person(Person otherperson)
    {
        this(otherperson.name, otherperson.age);
        System.out.println("copy contructor called");
    }
    @Override
    public String toString()
    {
        return name+"-"+age;
    }
}
