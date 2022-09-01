package com.task18;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Specialist specialist = new Specialist();
        Specialist[]specialists={
               new Specialist("John","Snow",31,45000.0,5),
               new Specialist("Aria","Stark",24,45000.0,5),
                new Specialist("Dane","Targ",23,30000.9,3),
        };

        Developer dev = new Developer();
        Developer[]developers={
                new Developer("Derek","Shepard",34,55000.0,"Middle"),
                new Developer("Antony","Berk",22,45000.0,"Junior"),
                new Developer("Meredith","Grey",31,80000.0,"Senior"),
                new Developer("Christina","Yang",35,80000.0,"Senior")
        };

        Manager manager=new Manager();
        Manager []managers={
                new Manager("Tom","Scavo",45,60000.0,true),
                new Manager("Orson","Hodge",45,50000.0,false)
        };

        CEO ceo = new CEO("Carlos","Solis",45,100000.0,true);


        specialist.getInfo(specialists);
        dev.getInfo(developers);
        manager.getInfo(managers);
        ceo.print();

        specialist.workWithClients();
        dev.writeCode();
        manager.writeProcedures();
        ceo.goPublic();




    }


}
