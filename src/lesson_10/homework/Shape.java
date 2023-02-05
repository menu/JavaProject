package lesson_10.homework;

public abstract class Shape {

    private String color;

    public Shape(String color){
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                '}';
    }
}
