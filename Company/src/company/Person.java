package company;

public class Person {
    final String name;
    final int CNP;
    final int age;
    final Address address;

    public Person(String name, int CNP, Address address, int age) {
        this.name = name;
        this.CNP = CNP;
        this.address = address;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }

    public int getCNP() {
        return CNP;
    }

    public int getAge() {
        return age;
    }


}
