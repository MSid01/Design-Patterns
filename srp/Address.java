package solid.live.srp;

public class Address {
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public Address(String street, String city, String country) {
        this.addressStreet = street;
        this.addressCity = city;
        this.addressCountry = country;
    }

}
