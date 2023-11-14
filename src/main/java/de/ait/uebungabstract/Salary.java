package de.ait.uebungabstract;

public class Salary extends Employee {

    private float salary;

    public Salary(String name, String address, String number, float salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float newSalary) {
        this.salary = newSalary;
    }

    public float computePay(){
        System.out.println("Высчитываем зарплату для " + getName());
        return salary * 12;
    }

    public void mailSalarySlip(){
        System.out.println("Отправляем расчетный лист " + getName()
                + " с зарплатой за год "  + salary + " за месяц " + getSalaryMonth(salary));
    }

    public float getSalaryMonth(float salary)
    {
        return salary/12;
    }

    @Override
    public String toString() {
        return "Salary: " +
                "salary=" + salary +
                " " + super.toString();
    }
}
