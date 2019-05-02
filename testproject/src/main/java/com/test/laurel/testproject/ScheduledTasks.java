package com.test.laurel.testproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    /**
     * The method reportPrimeNumbers is scheduled every 5 seconds and prints the Prime Numbers that are present till n
     */

    @Scheduled(initialDelay = 2000, fixedRate = 5000)
    public void reportPrimeNumbers() {
        log.info("Prime Numbers are {}", PrimeS.list);
        log.info("Current thread is {}",Thread.currentThread().getName());      //Used to find current thread
    }

    /**
     * The method reportEvenorOdd is scheduled every 7 seconds and prints the Even Or Odd Numbers that are prsent till e
     */

    @Scheduled(initialDelay = 2000, fixedRate = 7000)
    public void reportEvenorOdd() {
        log.info("Even Numbers are {}", EvenOrOddS.evenlist);
        log.info("Odd Numbers are {}",EvenOrOddS.oddlist);
        log.info("Current thread is {}",Thread.currentThread().getName());      //Used to find current thread
    }
}