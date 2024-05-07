public class Address {
    private String username;
    private int streetNo;
    private String city;
    private String state;
    public Address(String username, int streetNo, String city, String state) {
        this.username = username;
        this.streetNo = streetNo;
        this.city = city;
        this.state = state;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getStreetNo() {
        return streetNo;
    }
    public void setStreetNo(int streetNo) {
        if (streetNo > 0) {
            this.streetNo = streetNo;
        } else {
            System.out.println("Street number must be positive.");
        }
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String toString() {
        return "Username: " + username + ", Street No: " + streetNo + ", City: " + city + ", State: " + state;
    }

    public static void main(String[] args) {
        Address address = new Address("Jay", 123, "Bhopal", "M.P.");
        System.out.println(address);

    }
}

