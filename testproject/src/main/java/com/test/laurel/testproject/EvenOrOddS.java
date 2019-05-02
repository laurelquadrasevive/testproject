package com.test.laurel.testproject;

/**
 * This class contains the logic for finding even and odd numbers from a range of e numbers
 */

import java.util.ArrayList;
import java.util.List;

public class EvenOrOddS {
    static List<Integer> evenlist = new ArrayList<>();
    static List<Integer> oddlist = new ArrayList <>();

    static void main1(int n) {
        even(n);
        odd(n);
    }

    /**
     *
     * @param n
     * @return
     * this method takes n as input and returns a list containing odd numbers
     */

    private static List<Integer> odd(int n) {
        for (int s = 0; s <= n; s++) {
            if (s % 2 != 0) {
                oddlist.add(s);
            }
        }
        return oddlist;
    }

    /**
     *
     * @param n
     * @return
     * this method takes n as input and returns a list containing even numbers
     */

    private static List<Integer> even(int n) {
        for (int s = 0; s <= n; s++) {
            if (s % 2 == 0) {
                evenlist.add(s);
            }
        }
        return evenlist;
    }
}
