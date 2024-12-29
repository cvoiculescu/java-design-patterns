package org.voiculescu.liskov;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public Square setSide(int side) {
        this.side = side;
        return this;
    }

    @Override
    public int computeArea() {
        return side * side;
    }
}
