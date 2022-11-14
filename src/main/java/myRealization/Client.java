package myRealization;

public class Client {
    private String id, personnelNumber;
    private String name, address;

    public Client (String id, String name, String personnelNumber, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.personnelNumber = personnelNumber;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }

    public String getPersonnelNumber() {
        return personnelNumber;
    }

}
