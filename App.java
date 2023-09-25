package ak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Define an Employee class to store employee information
class Employee1 {
    private String name;
    private double salary;
    private String gender;

    // Constructor to initialize employee information
    public Employee1(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }
}

public class App {
    public static void main(String[] args) {
        // Create a list to store employee objects
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("Ali", 50000.0, "Female"));
        employees.add(new Employee1("Birju", 60000.0, "Male"));
        employees.add(new Employee1("Ena", 55000.0, "Female"));
        employees.add(new Employee1("Shubhangi", 65000.0, "Male"));

        // Create maps to store average salary by gender and count by gender
        Map<String, Double> averageSalaryByGender = new HashMap<>();
        Map<String, Integer> countByGender = new HashMap<>();

        double totalSalary = 0.0;

        // Calculate average salary by gender and count employees by gender
        for (Employee1 employee : employees) {
            String gender = employee.getGender();
            double salary = employee.getSalary();

            averageSalaryByGender.merge(gender, salary, Double::sum);
            countByGender.merge(gender, 1, Integer::sum);

            totalSalary += salary;
        }

        // Calculate total average salary for all employees
        double totalAverageSalary = totalSalary / employees.size();

        // Print average salary by gender
        System.out.println("Average Salary by Gender:");
        for (Map.Entry<String, Double> entry : averageSalaryByGender.entrySet()) {
            String gender = entry.getKey();
            double totalGenderSalary = entry.getValue();
            int genderCount = countByGender.get(gender);
            double averageSalary = totalGenderSalary / genderCount;
            System.out.println(gender + ": " + averageSalary);
        }

        // Print total average salary for all employees
        System.out.println("Total Average Salary for All Employees: " + totalAverageSalary);
    }
}
