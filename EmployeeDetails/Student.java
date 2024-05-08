package EmployeeDetails;

public class Student {
    private String name;
    private Address address;
    private int age;
    private double cgpa;
    private String branch;

    // Constructors
    public Student() {
    }

    public Student(String name, Address address, int age, double cgpa, String branch) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.cgpa = cgpa;
        this.branch = branch;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                ", cgpa=" + cgpa +
                ", branch='" + branch + '\'' +
                '}';
    }
}
