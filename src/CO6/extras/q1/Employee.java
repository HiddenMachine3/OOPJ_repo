package CO6.extras.q1;
public abstract class Employee {

    protected String Emp_name;
    protected int Emp_id;
    protected String Address;
    protected String Mail_id;
    protected String Mobile_no;

    public Employee(String Emp_name, int Emp_id, String Address, String Mail_id, String Mobile_no) {
        this.Emp_name = Emp_name;
        this.Emp_id = Emp_id;
        this.Address = Address;
        this.Mail_id = Mail_id;
        this.Mobile_no = Mobile_no;
    }

    public abstract double calculateDA();

    public abstract double calculateHRA();

    public abstract double calculatePF();

    public abstract double calculateStaffClubFund();

    public abstract double calculateGrossSalary();

    public abstract double calculateNetSalary();

    @Override
    public String toString() {
        return "Employee Name: " + Emp_name +
                "\nEmployee ID: " + Emp_id +
                "\nAddress: " + Address +
                "\nMail ID: " + Mail_id +
                "\nMobile Number: " + Mobile_no +
                "\nGross Salary: " + calculateGrossSalary() +
                "\nNet Salary: " + calculateNetSalary();
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Doe", 1001, "123 Main St", "john.doe@example.com", "1234567890",
                50000);
        AssistantProfessor assistantProfessor = new AssistantProfessor("Jane Smith", 2001, "456 Elm St",
                "jane.smith@example.com", "9876543210", 60000);
        AssociateProfessor associateProfessor = new AssociateProfessor("David Johnson", 3001, "789 Oak St",
                "david.johnson@example.com", "4567891230", 70000);
        Professor professor = new Professor("Sarah Williams", 4001, "321 Pine St", "sarah.williams@example.com",
                "7891234560", 80000);

        System.out.println("Programmer Pay Slip:");
        System.out.println(programmer.toString());

        System.out.println("\nAssistant Professor Pay Slip:");
        System.out.println(assistantProfessor.toString());

        System.out.println("\nAssociate Professor Pay Slip:");
        System.out.println(associateProfessor.toString());

        System.out.println("\nProfessor Pay Slip:");
        System.out.println(professor.toString());
    }
}

class Programmer extends Employee {
    private double BasicPay;

    public Programmer(String Emp_name, int Emp_id, String Address, String Mail_id, String Mobile_no, double BasicPay) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BasicPay = BasicPay;
    }

    public double calculateDA() {
        return 0.97 * BasicPay;
    }

    public double calculateHRA() {
        return 0.1 * BasicPay;
    }

    public double calculatePF() {
        return 0.12 * BasicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BasicPay;
    }

    public double calculateGrossSalary() {
        return BasicPay + calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    @Override
    public String toString() {
        return "Employee Name: " + Emp_name +
                "\nEmployee ID: " + Emp_id +
                "\nAddress: " + Address +
                "\nMail ID: " + Mail_id +
                "\nMobile Number: " + Mobile_no +
                "\nGross Salary: " + calculateGrossSalary() +
                "\nNet Salary: " + calculateNetSalary();
    }
}

class AssistantProfessor extends Employee {
    private double BasicPay;

    public AssistantProfessor(String Emp_name, int Emp_id, String Address, String Mail_id, String Mobile_no,
            double BasicPay) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BasicPay = BasicPay;
    }

    public double calculateDA() {
        return 0.97 * BasicPay;
    }

    public double calculateHRA() {
        return 0.1 * BasicPay;
    }

    public double calculatePF() {
        return 0.12 * BasicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BasicPay;
    }

    public double calculateGrossSalary() {
        return BasicPay + calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }
}

class AssociateProfessor extends Employee {
    private double BasicPay;

    public AssociateProfessor(String Emp_name, int Emp_id, String Address, String Mail_id, String Mobile_no,
            double BasicPay) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BasicPay = BasicPay;
    }

    public double calculateDA() {
        return 0.97 * BasicPay;
    }

    public double calculateHRA() {
        return 0.1 * BasicPay;
    }

    public double calculatePF() {
        return 0.12 * BasicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BasicPay;
    }

    public double calculateGrossSalary() {
        return BasicPay + calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }
}

class Professor extends Employee {
    private double BasicPay;

    public Professor(String Emp_name, int Emp_id, String Address, String Mail_id, String Mobile_no, double BasicPay) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BasicPay = BasicPay;
    }

    public double calculateDA() {
        return 0.97 * BasicPay;
    }

    public double calculateHRA() {
        return 0.1 * BasicPay;
    }

    public double calculatePF() {
        return 0.12 * BasicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BasicPay;
    }

    public double calculateGrossSalary() {
        return BasicPay + calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }
}