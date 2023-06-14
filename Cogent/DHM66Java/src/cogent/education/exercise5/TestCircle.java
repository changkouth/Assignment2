package cogent.education.exercise5;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Testing default constructor");
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.area());

        System.out.println("Testing 1 parameter constructor");
        Circle c2 = new Circle(2);
        System.out.println(c2.getRadius());
        System.out.println(c2.area());

    }
}
