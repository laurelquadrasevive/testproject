package com.test.laurel.testproject;

/**
 * This class contains the logic for printing prime numbers upto n
 */

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrimeS {

    static List<Integer> list = new ArrayList<>();

    /**
     *
     * @param n
     * @return
     * This method takes n as input and runs a loop till n and returns boolean (if prime = true, else = false)
     */

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    /**
     *
     * @param n
     * @return
     * This method takes n as input and returns a list which contains prime numbers by calling isPrime method
     */

    static List<Integer> printPrime(int n)
    {
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
                list.add(i);
        }
        return list;
    }

    static void main1(int n) {
        printPrime(n);
    }
}
