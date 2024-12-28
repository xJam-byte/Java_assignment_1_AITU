package models;

public class Teacher extends Person {
    private double salary;
    private String subject;
    private int yearsOfExperience;

    public Teacher(String name, String surname,  int age, Boolean gender, String subject,  int yearsOfExperience, int salary) {
        super(name,  surname, age, gender);
        this.subject = subject;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void giveRaise(int per){
        this.salary *= ((double) (per + 100) / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " I teacher " + this.getSubject() + " with salary: " + this.getSalary();
    }
}