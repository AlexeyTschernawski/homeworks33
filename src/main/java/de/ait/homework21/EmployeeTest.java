package de.ait.homework21;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {

        Manager managerMax = new Manager("Max", 60000, 25);
        Manager managerPaul = new Manager("Paul", 65000, 30);
        Manager managerAnna = new Manager("Anna", 80000, 45);

        Engineer engineerAlex = new Engineer("Alex", 45000, "Java");
        Engineer engineerUwe = new Engineer("Uwe",  "Python");
        Engineer engineerMaria = new Engineer("Maria", 45000, "SQL");

        Intern internJan = new Intern("Jan", 20000,"TechUni");
        Intern internMichael = new Intern("Michael", 20000,"FH");
        Intern internInna = new Intern("Inna", 20000,"Humbolt");

        ArrayList<Manager> managerList = new ArrayList<>();
        managerList.add(managerMax);
        managerList.add(managerPaul);
        managerList.add(managerAnna);

        for(Manager manager: managerList){
            manager.work();
        }

        ArrayList<Engineer> engineerArrayList = new ArrayList<>();
        engineerArrayList.add(engineerAlex);
        engineerArrayList.add(engineerUwe);
        engineerArrayList.add(engineerMaria);

        for(Engineer engineer: engineerArrayList){
            engineer.work();
        }

        engineerMaria.setSpecialization("C++");
        engineerMaria.work();

        System.out.println(engineerMaria.getSalary());

        //TODO Intern




    }
}
