package de.ait.uebungabstract;

public class TestEmployee {

    public static void main(String[] args) {
        Salary salary = new Salary("Зайцев", "Берлин", "1", 50000);
        salary.mailSalarySlip();
        System.out.println(salary.toString());


        Salary headOfTeam = new Salary("Волков", "Мюнхен", "2", 50000);
        headOfTeam.mailSalarySlip();
        System.out.println(salary.toString());

        headOfTeam.addEmployee(headOfTeam);
        headOfTeam.addEmployee(salary);
        headOfTeam.mailSalarySlip();

        //salaryJunior.toString();








    }
}
