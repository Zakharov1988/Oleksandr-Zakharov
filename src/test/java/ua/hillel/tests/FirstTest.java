package ua.hillel.tests;

import org.testng.annotations.Test;

public class FirstTest {
    @Test(groups = {"regression", "smoke", "P1"},
    enabled = true,
    dependsOnMethods = {"innerTest", "ua.hillel.tests.SecondTest.secondTest"},
    priority = 10)
    public void firstTest() {
        System.out.println("I'm first test");
        System.out.println("Running test on " + System.getProperty("url"));
    }
    @Test(priority = 20)
    public void newFuncTest(){
        System.out.println("newFuncTest2");
    }

    @Test(priority = 20)
    public void newFuncTest2(){
    }

    @Test(priority = 30)
    public void innerTest() {

    }
    @Test(priority = 40)
    public void test3 (){

    }
}
