package oop.exercise3;

public class Person {
    // private instance variables
    private String name, address;

    // Contructors
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "(" + address + ")";
    }
}
