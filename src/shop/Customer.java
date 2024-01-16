package shop;

import java.util.List;

public class Customer {
    private String name;
    private List<String> interests;

    public Customer() {

    }

    public Customer(String name, List<String> interests){
        this.name = name;
        this.interests = interests;
    }

    public void returnItem(String item){
        System.out.println("I would like to return " + item + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
