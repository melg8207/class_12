class employee {
    // Data members/instance variables
    String empName; // to store the name of the employee
    int empCode;    // to store the employee code
    double basicPay;    // to store the basic pay of the employee
    // Constructors
    // Default constructor
    employee() {
        empName="";
        empCode=0;
        basicPay=0.0;
    }
    // Parameterized constructor
    employee(String n, int p, double q) {
        empName=n;
        empCode=p;
        basicPay=q;
    }
    // Method to compute and return the total salary of the employee
    double salaryCal() {
        double hra=0.3*basicPay; // HRA = 30% of basic pay
        double da=0.4*basicPay;  // DA = 40% of basic pay
        double salary=basicPay+hra+da;
        // Special allowance calculation based on employee code and salary
        double specialAllowance;
        if(empCode<=15) {
            if(salary<=15000) {
                specialAllowance=Math.min(0.2*salary,2500);
            }else {
                specialAllowance=0;
            }
        }else {
            specialAllowance=1000;
        }
        // Total salary calculation
        return salary+specialAllowance;
    }
    public static void main(String[] args) {
        // Creating objects and calling methods
        employee emp1=new employee(); // Default constructor
        emp1.empName="John";
        emp1.empCode=10;
        emp1.basicPay=20000;
        System.out.println("Total Salary for employee 1: "+emp1.salaryCal());
        employee emp2=new employee("Alice",20,18000); // Parameterized constructor
        System.out.println("Total Salary for employee 2: "+emp2.salaryCal());
    }
}
