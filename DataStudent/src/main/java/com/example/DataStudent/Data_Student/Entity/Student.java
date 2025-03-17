package com.example.DataStudent.Data_Student.Entity;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String city;
    private String dob;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int id, String name, int age, String gender, String email, String city, String dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.city = city;
        this.dob = dob;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // toString() method for printing the object
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}