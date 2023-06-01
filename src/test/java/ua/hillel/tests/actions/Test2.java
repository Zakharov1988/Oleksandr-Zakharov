package ua.hillel.tests.actions;

import org.testng.annotations.*;

public class Test2 {

    @BeforeClass
    public void before(){

        System.out.println("==== Before Class Test2 ====");
    }

    @AfterClass
    public void after(){

        System.out.println("==== After Class Test2 ====");
    }

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("==== Before Method ====");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("==== After Method ====");
    }

    @Test
    public void test1(){

        System.out.println("==== Test 3 ====");
    }

    @Test
    public void test2(){

        System.out.println("==== Test 4 ====");
    }
}
