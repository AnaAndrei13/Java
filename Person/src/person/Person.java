package person;

public class Person {
    final String name;

    final String CNP;
    private Address address;

    public Person(String name, String CNP, Address address) {
        this.name = name;
        this.CNP = CNP;
        this.address = address;
    }
    public Address getAddress(){
        return this.address;
    }
    @Override
    public String toString() {
        return  name + "  " + address.getStreet() + ", " + address.getCity();
    }

    public void setAddress(Address new_address) {
        this.address = new_address;
    }
}
