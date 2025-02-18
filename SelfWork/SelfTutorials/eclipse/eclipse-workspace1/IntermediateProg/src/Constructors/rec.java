package Constructors;

public class rec {
    public abstract class Shape {
        public abstract int calculateArea();
    }
    
    public class Rectangle extends Shape {
        private int length;
        private int width;
    
        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }
    
        @Override
        public int calculateArea() {
            return length * width;
        }
    }
    
    public class Circle extends Shape {
        private int radius;
    
        public Circle(int radius) {
            this.radius = radius;
        }
    
        @Override
        public int calculateArea() {
            return (int) (Math.PI * radius * radius);
        }
    }

    public static void main(String[] args) {
        rec r = new rec();
        Shape rectangle = r.new Rectangle(4, 5);
        Shape circle = r.new Circle(4);
        System.out.println(String.format("The area of %s is %d", rectangle.getClass().getSimpleName(), rectangle.calculateArea()));
        System.out.println(String.format("The area of %s is %d", circle.getClass().getSimpleName(), circle.calculateArea()));
    }
}