package Encapsulation;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(50000);
        employee.setHourRate(20);

        int wage = employee.calculateWage(20);
        System.out.println(wage);
    }
}
