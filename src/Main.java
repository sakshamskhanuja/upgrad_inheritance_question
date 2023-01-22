import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj1 = new Rectangle();
        int numberOfSides = in.nextInt();

        if (numberOfSides == 0) {
            new Shape().display();
        } else if (numberOfSides == 3) {
            obj.display();
        } else if (numberOfSides == 4) {
            obj1.display();
        } else {
            System.out.println("Enter a valid number of sides!");
        }
    }
}

class Shape {
    public void display() {
        System.out.println("The shape is a circle");
    }
}

class Triangle extends Shape {
    @Override
    public void display() {
        System.out.println("The shape is a triangle");
    }
}

class Rectangle extends Shape {
    @Override
    public void display() {
        System.out.println("The shape is a rectangle");
    }
}

