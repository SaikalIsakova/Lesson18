package com.task18;

public class Specialist extends Employee{
    private int levels;

    public Specialist(){

    }

    public  Specialist (String name, String surname, int age, double salary,int levels) {
        super(name, surname, age, salary);
        this.levels=levels;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("levels : "+levels);

    }

    public void workWithClients(){
        System.out.println("I am writing my awesome algorithm");
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public String toString() {

        return
                " Name : "+ super.getName()+"|" + " Surname : "+super.getSurname()+"|" +
                 " Age : "+super.getAge()+"|"+ "Salary : "+super.getSalary()+"|"+
                 " levels : " + levels;
    }

    @Override
    public void getInfo(Employee[] employees) {
        super.getInfo(employees);
    }
}
