package models;

public class Person {
    private String name;
    private int age;
    public Person(String name, String surname, int age,  Boolean gender) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.gender = gender;
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private Boolean gender;
    private String surname;


    @Override
    public String toString() {
        return "Hi, I am " + this.getName() + " " + this.getSurname() + ", a " + this.getAge() + " years old " + this.getGender();
    }
}
