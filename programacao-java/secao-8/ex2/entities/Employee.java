package entities;

public class Employee {
    public String name;
    public double grossSalary, tax, percentage;
    
    public double netSalary() { 
        return percentage + (grossSalary - tax);
    }

    public void increaseSalary(double percentage) {
       this.percentage = (grossSalary * (percentage / 100));
    }

    public String toString() {
        return name
            + ", $ "
            +  String.format("%.2f", netSalary());
    }

}