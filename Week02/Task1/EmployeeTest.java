abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    void calculateSalary() {
        System.out.println("Full-Time Employee: " + name + " | ID: " + id + " | Salary: " + monthlySalary);
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Employee: " + name + " | ID: " + id + " | Salary: " + salary);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 20, 800);

        emp1.calculateSalary();  
        emp2.calculateSalary();  
}
}