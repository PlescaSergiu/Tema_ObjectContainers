package object_containers;

import java.util.Comparator;

class CompareName implements Comparator<Person> {



    public int compare(Person p1, Person p2) {

        return p1.getName().compareTo(p2.getName());
    }


}
