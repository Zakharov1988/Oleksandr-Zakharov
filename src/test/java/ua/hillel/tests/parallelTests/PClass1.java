package ua.hillel.tests.parallelTests;

import org.testng.annotations.Test;

public class PClass1 {
    @Test
    public void test(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){}
        System.out.printf("Test passed");
    }
}
