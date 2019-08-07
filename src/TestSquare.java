public class TestSquare {
    public static void main(String[] args) {
        Square square1= new Square();
        System.out.println("square1:"+square1);

        Square square2= new Square(20);
        System.out.println("square2:"+square2);

        Square square3= new Square(9.5,"pink",true);
        System.out.println("square3:"+ square3);
    }
}
