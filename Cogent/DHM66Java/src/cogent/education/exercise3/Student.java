package cogent.education.exercise3;

public class Student {
    public String role;
    public String name;
    private String address;
    private String email;

    public Student() {}

    public Student(String role, String name, String address, String email) {
        this.role = role;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void showDetails() {
        System.out.println("role: "+ role);
        System.out.println("name: "+ name);
        System.out.println("address: "+ address);
        System.out.println("email: "+ email);
    }

}
