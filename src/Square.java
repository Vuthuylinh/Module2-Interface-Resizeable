public class Square extends Rectangle {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {

        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        String squareDescribe = "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
        return squareDescribe;
    }

    @Override
    public void resize(double percent) {
        setSide(side * (1 + percent / 100));
    }

}
