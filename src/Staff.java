import java.util.Objects;

public class Staff {
    private String firstName;
    private String middleName;
    private int department;
    private double salary;
    private static int count = 1;
    private final int id;

    public Staff(String firstName, String middleName, int department, double salary) {
        this.id = count++;
        this.firstName = firstName;
        this.middleName = middleName;
        if (checkDeparmentValue(department)) {
            this.department = department;
        }
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }


    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDepartment(int department) {
        if (checkDeparmentValue(department)) {
            this.department = department;
        }
    }

    private boolean checkDeparmentValue(int department) {
        if (department > 5 || department < 0) {
            throw new IllegalArgumentException("Enter a value from 0 to 5");
        }
        return true;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void setCount(int count) {
        Staff.count = count;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + middleName + ". Department: " + department + ", salary = " + salary + ", id = " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return department == staff.department && Double.compare(staff.salary, salary) == 0 && id == staff.id && firstName.equals(staff.firstName) && middleName.equals(staff.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, department, salary, id);
    }

}
    

