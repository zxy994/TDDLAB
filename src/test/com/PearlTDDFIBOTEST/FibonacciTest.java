package test.com.PearlTDDFIBOTEST;

import com.PearlTDDFIBO.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FibonacciTest {
    @Test
    public void fibNaturalNumbers() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> actual = fibonacci.fib(7);
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibIncaseOfZero(){
        Fibonacci fibonacci = new Fibonacci();
        Exception exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.fib(0) ;
        });
        Assert.assertEquals("Invalid Input", exception.getMessage());
    }

    @Test
    public void fibIncaseOfOne(){
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> actual = fibonacci.fib(1);
        List<Integer> expected = Arrays.asList(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibIncaseOfTwo(){
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> actual = fibonacci.fib(2);
        List<Integer> expected = Arrays.asList(0,1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibIncaseOfNegativeInput(){
        Fibonacci fibonacci = new Fibonacci();
        Exception exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.fib(-1) ;
        });
        Assert.assertEquals("Invalid Input", exception.getMessage());
    }
}