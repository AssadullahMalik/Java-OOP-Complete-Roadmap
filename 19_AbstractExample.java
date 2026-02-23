abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    double hours;
    double rate;

    PartTimeEmployee(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}

public class 19_AbstractExample {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(20, 500);

        System.out.println("Full Time Salary: " + e1.calculateSalary());
        System.out.println("Part Time Salary: " + e2.calculateSalary());
    }
}
