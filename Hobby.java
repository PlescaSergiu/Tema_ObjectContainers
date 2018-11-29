package object_containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hobby {


    private String hobby;
    private int times;
    private List<Address> addresses = new ArrayList<>();


    public Hobby(String hobby, int times, Address... address) {
        this.hobby = hobby;
        this.times = times;
        Collections.addAll(this.addresses, address);

    }

    public String getHobby() {

        return hobby;
    }

    public int getTimes() {
        return times;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
