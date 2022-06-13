package test.java;

import com.company.Calculator;
import com.company.DivisionByZero;
import com.company.Main;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

public class SumTest {
    @Test
    void resultAddition() throws DivisionByZero {
        Calculator calculator = new Calculator();
        int res = calculator.result(10, 3, "+");
        Assert.assertEquals(13, res);
    }

    @Test
    void resultMultiplication() throws DivisionByZero {
        Calculator calculator = new Calculator();
        int res = calculator.result(28, 1, "*");
        Assert.assertEquals(28, res);
    }

    @Test
    void resultDivision() throws DivisionByZero {
        Calculator calculator = new Calculator();
        int res = calculator.result(100, 5, "/");
        Assert.assertEquals(20, res);
    }
}
