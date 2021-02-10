package Creational;

public class Person {
    private String name;
    private String identity;

    public Person() {
    }

    public Person(String name, String identity) {
        this.name = name;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
