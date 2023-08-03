package solid.live.srp;


public class Employee {
    private int empId;


    private String name;

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public int getThisYeard() {
        return thisYeard;
    }

    private Address address;
    private Salary salary;
    private LeaveInformation leaveInfo;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;




    public Employee(int empId, Salary monthlySalary, String name,Address address, LeaveInformation leaveInfo) {
        this.empId = empId; //should be in Employee
        this.salary = monthlySalary;  //could be in Employee
        this.name = name; //should be in Employee
        this.address = address;
        this.leaveInfo = leaveInfo;

    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Salary getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getManager() {
        return manager;
    }

    public LeaveInformation getLeaveInfo() {
        return leaveInfo;
    }

}
