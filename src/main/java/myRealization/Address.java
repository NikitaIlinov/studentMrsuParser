package myRealization;

public class Address {

    private int id;           // идентификатор
    private String city;         // город
    private String street;       // улица
    private String house;        // дом
    private String floor;        // этаж
    private String flatNumber;   // квартира


    public Address(String city, String street, String house, String floor, String flatNumber) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.house = house;
        this.floor = floor;
        this.flatNumber = flatNumber;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getFloor() {
        return floor;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    @Override
    public String toString() {
        return "город " + city + ", улица " + street + ", дом " + house + ", этаж " + floor + ", квартира " + flatNumber;
    }


}
