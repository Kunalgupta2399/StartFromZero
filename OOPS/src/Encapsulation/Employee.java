package Encapsulation;

public class Employee {
    private int baseSalary;
    private int hourRate;


    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("salary cannot be zero or loss");
        }
        this.baseSalary = baseSalary;
    }

    public int getHourRate() {
        return hourRate;
    }

    public void setHourRate(int hourRate) {
        if (hourRate <= 0) {
            throw new IllegalArgumentException("Hourly rate cannot be zero");
        }
        this.hourRate = hourRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourRate * extraHours);
    }
}

