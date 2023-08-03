package solid.live.srp;

public class HTMLFormatter implements Formatter{
    Employee employee;

    void Formatter(Employee employee){
        this.employee = employee;
    }

    @Override
    public String format() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        return str;
    }

}
