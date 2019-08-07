import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1 + ", area= "+ rectangle1.getArea()+ ", perimeter= "+ rectangle1.getPerimeter());


        System.out.println("Enter rectangle2 length: ");
        double length2=scanner.nextDouble();
        System.out.println("Enter rectangle2 width: ");
        double width2 = scanner.nextDouble();
        Rectangle rectangle2= new Rectangle(length2,width2);
        System.out.println("Rectangle2: "+rectangle2+ ", area= "+ rectangle2.getArea()+", perimeter= "+ rectangle2.getPerimeter());


        Rectangle rectangle3= new Rectangle("pink",true);
        System.out.println("Rectangle3: "+rectangle3);

        Rectangle rectangle4= new Rectangle("blue",true,30,16);
        System.out.println("Rectangle4: " +rectangle4);
    }
}
