package inheritance.no;

public class Square extends Rectangle {
    public Square(int size) {
        super(size, size);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        // What about the height?
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        // What about the width?
    }
}
