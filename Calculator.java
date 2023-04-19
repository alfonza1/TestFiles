package Calculator;

public class Calculator {


    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){

        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static double squareRoot(double a){
        return Math.floor(Math.sqrt(a));
    }



    public int exponent(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }






}
