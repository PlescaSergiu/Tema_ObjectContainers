package object_containers;

import java.util.Comparator;

class CompareAge implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        int count = 0;
        if(p1.getAge()> p2.getAge()){
            count = 1;
        }
        if ( p1.getAge() ==p2.getAge()) {
            count = 0;
        }
        if (p1.getAge()<p2.getAge()){
            count = -1;

        }
    return count;
    }
}
