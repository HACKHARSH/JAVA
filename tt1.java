import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employee {
    private int empNo;
    private String empName;
    private Date joinDate;
    private char desigCode;
    private String department;
    private double basic;
    private double hra;
    private double it;

    // Constructor
    public Employee(int empNo, String empName, String joinDate, char desigCode, String department,
                    double basic, double hra, double it) throws ParseException {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
        this.desigCode = desigCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    // Getter methods
    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public char getDesigCode() {
        return desigCode;
    }

    public String getDepartment() {
        return department;
    }

    public double calculateSalary() {
        double da = getDA();
        return basic + hra + da - it;
    }

    private double getDA() {
        switch (desigCode) {
            case 'e':
                return 20000;
            case 'c':
                return 32000;
            case 'k':
                return 12000;
            case 'r':
                return 15000;
            case 'm':
                return 40000;
            default:
                return 0;
        }
    }

    // Override toString() method for easy printing
    @Override
    public String toString() {
        return String.format("%-6d%-8s%-12s%-15s%.2f", empNo, empName, department, getDesignation(), calculateSalary());
    }

    private String getDesignation() {
        switch (desigCode) {
            case 'e':
                return "Engineer";
            case 'c':
                return "Consultant";
            case 'k':
                return "Clerk";
            case 'r':
                return "Receptionist";
            case 'm':
                return "Manager";
            default:
                return "";
        }
    }
}

public class tt1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java EmployeeDetails <employee_id>");
            return;
        }

        int targetEmpNo = Integer.parseInt(args[0]);
        final Employee[] employees = initializeEmployees();

        Employee foundEmployee = findEmployee(employees, targetEmpNo);

        if (foundEmployee != null) {
            System.out.println("Emp No. Emp Name Department Designation Salary");
            System.out.println(foundEmployee);
        } else {
            System.out.println("There is no employee with empid: " + targetEmpNo);
        }
    }

    private static Employee findEmployee(Employee[] employees, int targetEmpNo) {
        for (Employee employee : employees) {
            if (employee.getEmpNo() == targetEmpNo) {
                return employee;
            }
        }
        return null;
    }

    private static Employee[] initializeEmployees() {
        try {
            return new Employee[]{
                    new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
                    new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
                    new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
                    new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
                    new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
                    new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
                    new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
            };
        } catch (ParseException e) {
            e.printStackTrace();
            return new Employee[0];
        }
    }
}