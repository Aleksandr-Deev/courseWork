public class Employee {
    private final String lastName; // фамилия
    private final String firstName; // имя
    private final String patronymic; // отчество
    private int department;
    private int salary;
    private static int counter = 0;
    private final int id;


    public Employee(String lastName, String firstName, String patronymic, int department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "id: " + getId() + " - " + getLastName() + " " + getFirstName() + " " + getPatronymic() + ". Отдел - "
                + getDepartment() + ", зарплата - " + getSalary();
    }

}
