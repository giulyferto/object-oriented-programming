package ar.com.ada.online.second.abstractclassexerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figure firstCircle = new Circle();
        Figure secondCircle = new Circle();
        Figure thirdCircle = new Circle();

        Figure[] circles = {firstCircle, secondCircle, thirdCircle};


        Figure firstRectangle = new Rectangle();
        Figure secondRectangle = new Rectangle();
        Figure thirdRectangle = new Rectangle();

        Figure[] rectangles = {firstRectangle, secondRectangle, thirdRectangle};


        Figure firstTriangle = new Triangle();
        Figure secondTriangle = new Triangle();
        Figure thirdTriangle = new Triangle();

        Figure [] triangles = {firstTriangle, secondTriangle, thirdTriangle};

        Scanner keyboard = new Scanner(System.in);

        String answer;
        System.out.print("Elija una figuta geometrica (circulo, rectangulo, triangulo): ");
        answer = keyboard.nextLine();

        if (answer.equals("circulo")) {
            /*System.out.print("Ingrese el radio del primer circulo: ");
            firstCircle = new Circle(keyboard.nextDouble());
            System.out.print("Ingrese el readio del segundo circulo: ");
            secondCircle = new Circle(keyboard.nextDouble());
            System.out.print("Ingrese el radio del tercer circulo: ");
            thirdCircle = new Circle(keyboard.nextDouble());*/

            for (int i = 0; i < 3; i++) {
                System.out.printf("Ingrese el valor del radio para el circulo %d: ", i + 1);
                circles[i] = new Circle(keyboard.nextDouble());
            }


        } else if (answer.equals("rectangulo")) {
            /*System.out.print("Ingrese la base y la altura del primer rectangulo: ");
            firstRectangle = new Rectangle(keyboard.nextDouble(), keyboard.nextDouble());
            System.out.print("Ingrese la base y la altura del segundo rectangulo: ");
            secondRectangle = new Rectangle(keyboard.nextDouble(), keyboard.nextDouble());
            System.out.print("Ingrese la base y la altura del tercer rectangulo: ");
            thirdRectangle = new Rectangle(keyboard.nextDouble(), keyboard.nextDouble());*/

            for (int i = 0; i < 3; i++) {
                System.out.printf("Ingrese la base y la altura del rectangulo %d: ", i + 1);
                rectangles[i] = new Rectangle(keyboard.nextDouble(), keyboard.nextDouble());
            }

        } else if (answer.equals("triangulo")) {
            /*System.out.print("Ingrese la base y la altura del primer triangulo: ");
            firstTriangle = new Triangle(keyboard.nextDouble(), keyboard.nextDouble());
            System.out.print("Ingrese la base y la altura del segundo triangulo: ");
            secondTriangle = new Triangle(keyboard.nextDouble(), keyboard.nextDouble());
            System.out.print("Ingrese la base y la altura del tercer triangulo: ");
            thirdTriangle = new Triangle(keyboard.nextDouble(), keyboard.nextDouble());*/
            for (int i = 0; i < 3; i++) {
                System.out.printf("Ingrese la base y la altura del triangulo %d: ", i + 1);
                triangles [i] = new Triangle(keyboard.nextDouble(), keyboard.nextDouble());
            }

        } else {
            System.out.println("No se puede realizar la operacion");
        }
    }
}
