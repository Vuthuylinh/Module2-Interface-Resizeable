import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Circle circle1 = new Circle();
        System.out.println(circle1);

        System.out.println("Enter radius of circle2: ");
        double radius2 = scanner.nextDouble();
        Circle circle2= new Circle(radius2);
        System.out.println(circle2);

        System.out.println("Enter radius of circle3: ");
        double radius3=scanner.nextDouble();
        System.out.println("Enter color of circle3:");
        String color=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter true for filled/ false for not filled circle3: ");
        boolean filled=scanner.nextBoolean();
        Circle circle3= new Circle(color,filled,radius3);
        System.out.println(circle3);
    }
}
