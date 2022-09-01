package com.task18;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Employee() {

    }

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }


    public void print() {
        System.out.println(" Name : "+ name + "\n Surname : "+surname +"\n Age : "+ age +"\n Salary : "+ salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getInfo(Employee[]employees){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public void run(){
        System.out.println("run");
    }
}
