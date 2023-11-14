package de.ait.uebungabstract;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    private String name;
    private String address;
    private String number;

    private List<Employee> employeeList = new ArrayList<>();

    public Employee(String name, String address, String number) {
        System.out.println("Вызов конструктора Employee. Вносим данные о сотруднике");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract float computePay();

    public void mailSalarySlip(){
        System.out.println("Отправляем расчетный лист " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
