package object_containers;

import java.util.*;

public class Main {


    public static void main(String... args) {
        List<Person> persoane = new ArrayList<>();

        persoane.add(new Student("Ion", 121, 242512315));
        persoane.add(new Somer("Gabi", 42, 12321421));
        persoane.add(new Student("Max", 12, 1321414));
        persoane.add(new Somer("Ana", 34, 2441515));

        Set<Person> personSetOrderAge = new TreeSet<>(new CompareAge());

        personSetOrderAge.addAll(persoane);
        System.out.println(personSetOrderAge);

        Set<Person> personSetOrderName = new TreeSet<>(new CompareName());

        personSetOrderName.addAll(persoane);
        System.out.println(personSetOrderName);

        List<Hobby> hobbyList = new ArrayList<>();

        Address address1 = new Address("Romania", "Cluj", "Brancusi", 34);
        Address address2 = new Address("France", "Paris", "Freedom", 45);


        Hobby cicling = new Hobby("cicling", 4, address1, address2);
        Hobby coding = new Hobby("coding", 54, address2);

        hobbyList.add(cicling);
        hobbyList.add(coding);

        HashMap<Person, List<Hobby>> persoaneAndHobby = new HashMap<>();
        persoaneAndHobby.put(persoane.get(1), hobbyList);
        persoaneAndHobby.put(persoane.get(0), hobbyList);

        Person person = persoane.get(0);

        System.out.println(person.getName());
        persoaneAndHobby.get(person).forEach(i -> {
            System.out.println(i.getHobby() + " practiced in:");
            i.getAddresses().forEach(j -> System.out.println(j.getCountry()));
        });


    }


}
