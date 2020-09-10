package ar.com.ada.online.second.ejerciciopasodevariables;

public class Main {

    public static void main(String[] args) {

        //Se instancian las clases
        Result result = new Result();
        Arithmetic operations = new Arithmetic();

        //Se asignan los valores
        operations.sum(10, 10, result);
        operations.subtraction(10,10, result);
        operations.multiplication(10,10, result);
        operations.division(10,10, result);


        //Se muestran los resultados
        System.out.println("El resultado de la suma es de: " + result.getResultSum());
        System.out.println("El resultado de la resta es de: " + result.getResultSubstraction());
        System.out.println("El resultado de la multiplicacion es de: " + result.getResultMultiplication());
        System.out.println("El resultado de la division es de: " + result.getResultDivision());
    }
}
