import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        Shape shape1 = new Shape();
        System.out.println(shape1);
        System.out.println("Enter color of shape: ");
        String color=sc.nextLine();
        System.out.println("Enter true for filled/ false for not filled: ");
        boolean filled=sc.nextBoolean();
        Shape shape2 = new Shape(color,filled);
        System.out.println(shape2);

    }
}
