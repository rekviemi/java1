package ru.rekvi.sas.polimorfizm;

public class Salary extends Employee {
    private double salary;


    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Внутри mailCheck класса Salary ");
        System.out.println("Отправляем чек " + getName() + " с зарплатой " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    public double computePay() {
        System.out.println("Вычисляем заработанную плату для " + getName());
        return salary/52;
    }


}
