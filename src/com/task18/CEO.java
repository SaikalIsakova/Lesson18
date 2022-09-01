package com.task18;

public class CEO extends Employee{
    private boolean hasCompanyCar;

    public CEO(){}

    public CEO(String name, String surname, int age, double salary,boolean hasCompanyCar) {
        super(name, surname, age, salary);
        this.hasCompanyCar=hasCompanyCar;
    }


    public void print() {
        super.print();
        System.out.println(" Has company car :"+hasCompanyCar);
    }

    public void goPublic(){
        System.out.println("I represent a company");
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    @Override
    public String toString() {
        return " Name : "+ super.getName()+"|" + " Surname : "+super.getSurname()+"|" +
                " Age : "+super.getAge()+"|"+ "Salary : "+super.getSalary()+"|" +
                "hasCompanyCar=" + hasCompanyCar;
    }

    @Override
    public void getInfo(Employee[] employees) {
        super.getInfo(employees);
    }
}
