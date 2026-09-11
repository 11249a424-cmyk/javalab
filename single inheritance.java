import java.util.Scanner;
class Employee {
    int id;
    String name;
    double basicSalary;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        name = sc.next();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra, da, totalSalary;

    void calculateSalary() {
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        totalSalary = basicSalary + hra + da;
    }

    void displaySalary() {
        display();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + totalSalary);
    }
}
class EmployeeSalary {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();

        p.getDetails();
        p.calculateSalary();
        p.displaySalary();
    }
}
