
public class Person1
{
    final String name;
    final int age;
    final String address;
   final int CNP;

    public Person1(String name, int age,String address, int CNP) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.CNP = CNP;
    }

    @Override
    public String toString() {
        return   "Name: " + name +
                ", age: " + age +
                ", address: " + address +
                ", CNP: " + CNP ;

    }
}
