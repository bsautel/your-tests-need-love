package inheritance.no;

public class Square extends Rectangle {
    public Square(int length) {
        super(length, length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        // What about the length?
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        // What about the width?
    }
}
