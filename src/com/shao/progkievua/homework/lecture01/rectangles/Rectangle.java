package com.shao.progkievua.homework.lecture01.rectangles;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getPerimeter() {
        return (height + width) * 2;
    }

    public int getArea() {
        return height * width;
    }

    public String toString() {
        return "height: " + height + ", width: " + width + ", perimeter: " + getPerimeter() + ", area: " + getArea();
        /*
        return new StringBuilder()
                .append("height: ").append(height)
                .append(", width: ").append(width)
                .append(", perimeter: ").append(getPerimeter())
                .append(", area: ").append(getArea())
                .toString();
        */
    }
}
