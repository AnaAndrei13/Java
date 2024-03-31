package person;

public class Address {
    private String street;
    private String nr;
    private String city;


    public Address(String street, String nr, String city) {
        this.street = street;
        this.nr = nr;
        this.city = city;

    }

    public String getStreet() {
        return street;
    }

    public String getNr() {
        return nr;
    }

    public String getCity() {
        return city;
    }

    public void setAddress(String street, String nr, String city){
        this.street = street;
        this.nr = nr;
        this.city = city;
    }
}
