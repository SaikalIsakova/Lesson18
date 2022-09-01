package com.task18;

public class Developer extends Employee{
    private String grades;

    public Developer(){}

    public Developer(String name, String surname, int age, double salary,String grades) {
        super(name, surname, age, salary);
        this.grades=grades;
    }


    public void print() {
        super.print();
        System.out.println("Grades : "+ grades);
    }

    public void writeCode(){

        System.out.println("I write code that no one can do");
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return " Name : "+ super.getName()+"|" + " Surname : "+super.getSurname()+"|" +
                " Age : "+super.getAge()+"|"+ "Salary : "+super.getSalary()+"|"+
                "grades='" + grades ;
    }

    @Override
    public void getInfo(Employee[] employees) {
        super.getInfo(employees);
    }
}
