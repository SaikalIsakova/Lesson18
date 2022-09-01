package com.task18;

public class Manager extends Employee{
    private boolean hasStock;

    public Manager(){}

    public Manager(String name, String surname, int age, double salary,boolean hasStock) {
        super(name, surname, age, salary);
        this.hasStock=hasStock;
    }


    @Override
    public String toString() {
        return " Name : "+ super.getName()+"|" + " Surname : "+super.getSurname()+"|" +
                " Age : "+super.getAge()+"|"+ "Salary : "+super.getSalary()+"|" +
                "hasStock=" + hasStock;
    }

    public void print() {
        super.print();
        System.out.println("Has stocks is : "+ hasStock);
    }

    public void writeProcedures(){
        System.out.println("I am writing procedures");
    }
    public boolean isHasStock() {
        return hasStock;
    }

    public void setHasStock(boolean hasStock) {
        this.hasStock = hasStock;
    }

    @Override
    public void getInfo(Employee[] employees) {
        super.getInfo(employees);
    }
}
