package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {


    @Test
    public void addTest(){

        Calculator calc = new Calculator();

        int val1 = 7;
        int val2 = 2;
        int expected = 9;
      int actual = calc.add(val1,val2);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void subtractTest(){

        Calculator calc = new Calculator();

        int val1 = 7;
        int val2 = 2;
        int expected = 5;
        int actual = calc.subtract(val1,val2);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void multiplyTest(){

        Calculator calc = new Calculator();

        int val1 = 7;
        int val2 = 2;
        int expected = 14;
        int actual = calc.multiply(val1,val2);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void divideTest(){

        Calculator calc = new Calculator();

        int val1 = 8;
        int val2 = 2;
        int expected = 4;
        int actual = calc.divide(val1,val2);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void squareTest(){

        Calculator calc = new Calculator();

        double val1 = 69.0;
        double expected = 8.0;
        double actual = calc.squareRoot(val1);

        Assert.assertEquals(expected,actual,0);

    }


    @Test
    public void exponentTest(){

        Calculator calc = new Calculator();

        int val1 = 3;
        int val2 = 3;
        int expected = 27;
        int actual = calc.exponent(val1,val2);

        Assert.assertEquals(expected,actual);

    }



}
