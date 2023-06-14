package cogent.education.exercise4;

public class Employee {
    private String name;
    private String department;
    private String email;
    private int age;
    private int id = 0;
    private static int uniqueID = 0;

    public Employee() {

    }

    public Employee(String name, String department, String email, int age) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.age = age;
        id = Employee.generateID();

    }

    public static int generateID() {
        int empIdCounter = uniqueID;
        empIdCounter++;
        uniqueID = empIdCounter;
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmployee() {
        System.out.println("id: "+id);
        System.out.println("age: "+age);
        System.out.println("name: "+name);
        System.out.println("department: "+department);
        System.out.println("email: "+email);
    }
}
