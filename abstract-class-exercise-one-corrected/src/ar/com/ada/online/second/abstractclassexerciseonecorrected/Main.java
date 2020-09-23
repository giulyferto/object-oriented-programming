package ar.com.ada.online.second.abstractclassexerciseonecorrected;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor elija una figura: \n\t1) Circulo \n\t2) Rectangulo \n\t3) Triangulo" );
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Circle circle = createCircle(keyboard);
                    figures.add(circle);
                    break;

                case 2:
                    Rectangle rectangle = createRectangle(keyboard);
                    figures.add(rectangle);
                    break;
                case 3:
                    Triangle triangle = createTriangle(keyboard);
                    figures.add(triangle);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                   // System.exit(0);

            }
        }
        showResults(figures);

    }

    public static Circle createCircle(Scanner keyboard) {
        Circle circle = new Circle();
        System.out.print("Ingrese el radio del circulo: " );
        Double radio = keyboard.nextDouble();
        circle.setRadius(radio);

        return circle;
    }

    public static Rectangle createRectangle(Scanner keyboard) {
        Rectangle rectangle = new Rectangle();

        System.out.print("Ingrese la base del rectangulo: " );
        Double base = keyboard.nextDouble();
        rectangle.setBase(base);

        System.out.print("Ingrese la altura del rectangulo: " );
        Double height = keyboard.nextDouble();
        rectangle.setHeight(height);

        return rectangle;

    }

    public static Triangle createTriangle(Scanner keyboard) {
        Triangle triangle = new Triangle();
        System.out.print("Ingrese la base del rectangulo: " );
        Double base = keyboard.nextDouble();
        triangle.setBase(base);
        System.out.print("Ingrese la altura del rectangulo: " );
        Double height = keyboard.nextDouble();
        triangle.setHeight(height);

        return triangle;

    }
    public static void showResults (ArrayList<Figure> figures){
        for (Figure figure : figures) {
            figure.calculateArea();

            switch (figure.getClass().getSimpleName()){
                case "Circle":
                    Circle circle = (Circle) figure;
                    System.out.println("Circulo");
                    System.out.println("\tRadio: "+ circle.getRadius());
                    break;
                case "Rectangle":
                    Rectangle rectangle = (Rectangle) figure;
                    System.out.println("Rectangulo");
                    System.out.println("\tBase: "+ rectangle.getBase());
                    System.out.println("\tAltura: "+ rectangle.getHeight());
                    break;
                case "Triangle":
                    Triangle triangle = (Triangle) figure;
                    System.out.println("Triangulo");
                    System.out.println("\tBase: "+ triangle.getBase());
                    System.out.println("\tAltura: "+ triangle.getHeight());
                    break;
            }

            System.out.println("\tArea: " + figure.getArea());
        }
        if (areFiguresEqual(figures)){
            System.out.println("Existen figuras iguales.");
        } else {
            System.out.println("No existen figuras iguales.");
        }
    }
    public static  Boolean areFiguresEqual (ArrayList<Figure> figures) {
        Boolean equals = null;
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            for (int j = i + 1; j < figures.size(); j++) {
                 equals = figure.equals(figures.get(j));
                 if (equals) return  equals;
            }
        }
        return equals;
    }
}
