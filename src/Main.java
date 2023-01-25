import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees(); 
        int wage = employee.calculateWage(14);
        System.out.println(wage);
    }

}