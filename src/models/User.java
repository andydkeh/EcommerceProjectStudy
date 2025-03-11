package models;

public class User {
    private String name;
    private String email;
    private String address;

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void returnInfosUser () {
        System.out.println("Name: " + this.name + ", Email: " + this.email + ", Address: " + this.address);
    }
}
