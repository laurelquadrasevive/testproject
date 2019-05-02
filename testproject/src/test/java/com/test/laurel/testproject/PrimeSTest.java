package com.test.laurel.testproject;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class PrimeSTest {

    List<Integer> primeList1 = Arrays.asList(2,3,5,7);
    List<Integer> primeList2 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);

    PrimeS primeS = new PrimeS();


    @Test
    public void primenumberswhenNis10() {
        Assert.assertEquals(primeList1,PrimeS.printPrime(10));
    }

    @Test
    public void primenumberswhenNis20() {
        Assert.assertEquals(primeList2, PrimeS.printPrime(20));
    }
}
