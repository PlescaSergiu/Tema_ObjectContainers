package object_containers;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private long CNP;


    public Person(String name, int age, long CNP) {
        this.name = name;
        this.age = age;
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getCNP() {
        return CNP;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CNP=" + CNP +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return (Objects.equals(CNP, p.getCNP()) && (p.getName().equals(name)));
    }
}
