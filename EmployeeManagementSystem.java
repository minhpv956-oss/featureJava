package employeemanagementsystem;

import data.Employee;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        employeeCheck();
    }

    public static void employeeCheck() {
        String name, id;
        double salary;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input n:");
        int n = Integer.parseInt(sc.nextLine());

        Employee employee[] = new Employee[n];
        for (int i = 0; i < n; i++) {

            System.out.printf("Input id:");
            id = sc.nextLine();
            System.out.printf("input name:");
            name = sc.nextLine();
            System.out.printf("input salary:");
            salary = Double.parseDouble(sc.nextLine());
            employee[i] = new Employee(id, name, salary);
        }

        for (int i = 0; i < employee.length; i++) {
            employee[i].showInfo();
        }

        Employee highestSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > highestSalary.getSalary()) {

                highestSalary = employee[i];

            }
        }
        System.out.println("employee with the highest salary:");
        highestSalary.showInfo();

        double averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {

            averageSalary += employee[i].getSalary();
        }
        averageSalary = averageSalary / employee.length;
        System.out.println("average of the ");
        System.out.println(averageSalary);

        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < employee.length - 1; j++) {

                if (employee[i].getSalary() > employee[j].getSalary()) {

                    Employee temp;

                    temp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = temp;

                }

            }

        }
        System.out.println("after sort by salary");
        for (Employee employee1 : employee) {

            employee1.showInfo();
        }
    }

}
