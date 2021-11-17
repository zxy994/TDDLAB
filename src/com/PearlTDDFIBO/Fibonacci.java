package com.PearlTDDFIBO;

import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    //Fibonacci method
    public List<Integer> fib(Integer n) {
        int firstNum = 0, secondNum = 1, counter;

    //A list to hold fibonacci sequence generated based on parameter n
        List<Integer> sequence = new java.util.ArrayList<>(List.of(0,1));

    //Control if statement based on test demands
        if(n == 0 || n == 1) {
            List<Integer> caseZero = Arrays.asList(0);
            return caseZero;
        } else if (n < 0){
            throw new IllegalArgumentException("Invalid Input");
        }

    //Some fibonacci algorithm
        for (counter = 2; counter < n; counter++) {
            int next = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = next;
            sequence.add(secondNum);
        }

   // Returning fibonacci sequence
        return sequence;
    }
}