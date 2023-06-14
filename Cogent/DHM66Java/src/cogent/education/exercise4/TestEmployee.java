package cogent.education.exercise4;

public class TestEmployee {

    public static void main(String[] args) {
        Employee ep1 = new Employee("Todd", "CS", "Todd@gmail.com", 34);
        Employee ep2 = new Employee("Chris", "BM", "Chris@gmail.com", 30);
        Employee ep3 = new Employee("Rob", "SCI", "rob@gmail.com", 26);
        ep1.setEmployee();
        System.out.println("--------------------------------------------------");
        ep2.setEmployee();
        System.out.println("--------------------------------------------------");
        ep3.setEmployee();
    }
}
