package DesignPrinciples.SingleResponsibilityPrinciple;

public class Employee {
    private String name;
    private String email;
    private double baseSalary;
    public Employee(String name, String email, double baseSalary) {
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
}
class PayrollCalculator {
    public double calculateSalaray(Employee employee) {
        double base = employee.getBaseSalary();
        double tax = base * 0.2;
        double benifits = 1000;
        return base * tax * benifits;
    }
}
class EmployeeRepository{
    public void save(Employee employee) {
        System.out.println("Saving Employee : " + employee.getName() + " to database....");
    }
}
class PayslipGenerator {
    public String generatePayslip(Employee employee, double netPay) {
        return "Payslip for: " + employee.getName() + "\n" +
                "Email: " + employee.getEmail() + "\n" +
                "Net Pay: ₹" + netPay + "\n" +
                "----------------------------\n";
    }
}
class EmailService {
    public void sendPayslip(Employee employee, String payslip) {
        System.out.println("Sending payslip to: " + employee.getEmail());
        // Simulate email with a print
        System.out.println(payslip);
    }
}
class Main {
    public static void main(String[] args) {
        Employee obj = new Employee("Srivatsan", "sriram5srivatsan@gmail.com",3500.999);
        obj.getName();
        obj.getEmail();
        obj.getBaseSalary();
        PayrollCalculator obj1 = new PayrollCalculator();
        System.out.println(obj1.calculateSalaray(obj));
        EmployeeRepository obj2 = new EmployeeRepository();
        obj2.save(obj);
        PayslipGenerator obj3 = new PayslipGenerator();
        System.out.println(obj3.generatePayslip(obj,400000));
        EmailService obj4 = new EmailService();
        obj4.sendPayslip(obj,obj3.generatePayslip(obj,400000));
    }
}

