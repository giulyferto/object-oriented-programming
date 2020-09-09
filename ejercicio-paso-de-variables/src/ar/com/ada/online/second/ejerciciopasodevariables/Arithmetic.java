package ar.com.ada.online.second.ejerciciopasodevariables;

public class Arithmetic {

    public Integer sum(int a, int b, Result resultSum) {
        resultSum.setResultSum(a + b);
        return resultSum.getResultSum();
    }

    public Integer subtraction(int a, int b, Result resultSubtraction) {
        resultSubtraction.setResultSubstraction(a - b);
        return resultSubtraction.getResultSubstraction();
    }

    public Integer multiplication(int a, int b, Result resultMultiplication) {
        resultMultiplication.setResultMultiplication(a * b);
        return resultMultiplication.getResultMultiplication();
    }

    public Integer division(int a, int b, Result resultDivision) {
        resultDivision.setResultDivision(a / b);
        return resultDivision.getResultDivision();
    }
}
