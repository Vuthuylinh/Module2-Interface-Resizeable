import java.util.Random;
import java.util.Scanner;

public class Main_TestResizeable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random= new Random();
        double percent = random.nextInt(100);
        System.out.println("percent = "+percent+ "%");
        // Test Circle extend Shape ,(Shape implement interface Resizeable)
        Circle [] circles= new Circle[3];
        circles[0]=new Circle();
        circles[1]= new Circle(8);
        circles[2]=new Circle(4);

        System.out.println("circles before resize: ");
        for (Circle circle:circles){
            System.out.println(circle.getRadius());
        }
        System.out.println("circles before resize: ");
        for (Circle circle:circles){
            circle.resize(percent);
            System.out.println(circle.getRadius());
        }

        //Test Rectangle extend Shape ,(Shape implement interface Resizeable
        Rectangle [] rectangles= new Rectangle[3];
        rectangles[0]= new Rectangle();
        rectangles[1]= new Rectangle(8,5);
        rectangles[2]= new Rectangle(2,1);
        System.out.println("Rectangle before resize: ");
        for(Rectangle rectangle:rectangles){
            System.out.println(rectangle.getArea());
        }
        System.out.println("Rectangle after resize: ");
        for(Rectangle rectangle:rectangles){
            rectangle.resize(percent);
            System.out.println(rectangle.getArea());
        }

        //Test Square extend Shape ,(Shape implement interface Resizeable
        Square[]squares= new Square[3];
        squares[0]=new Square();
        squares[1]= new Square(4);
        squares[2]=new Square(7);
        System.out.println("squares before resize: ");
        for(Square square:squares){
            System.out.println(square.getSide());
        }

        System.out.println("squares after resize: ");
        for(Square square:squares){
            square.resize(percent);
            System.out.println(square.getSide());
        }

    }
}
