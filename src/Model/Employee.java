package Model;

public class Employee {
    private int id;
    public String name;
    public int age;
    public String department;
    public String code;
    private Float salaryrate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Float getSalaryrate() {
        return salaryrate;
    }

    public void setSalaryrate(Float salaryrate) {
        this.salaryrate = salaryrate;
    }

    public Employee(int id, String name, int age, String department, String code, Float salaryrate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryrate = salaryrate;
    }
}
