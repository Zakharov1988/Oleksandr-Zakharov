package ua.hillel.tests.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginTest {
    @Test(priority = 1, dataProvider = "userProvider")
    public void userRoleTest(String username, String password, String role) {
        System.out.printf("name: %s - password: %s - role: %s%n", username, password, role);
        System.out.println("Starting test for " + role);
        if (role.equals("admin")) {
            throw new RuntimeException("Test failed");
        }
        System.out.println("Test for " + role + " passed");
    }


    @DataProvider(name = "userProvider")
    public Object[][] userProvider() {
        String[][] users = {
                {"userName", "userPass", "user" },
                {"adminName", "adminPass", "admin" },
                {"guestName", "guestPass", "guest" },
        };
        return users;
    }

    @Test(priority = 2)
    public void FuncTest() {
        System.out.println("FuncTest2");
    }

    @Test(priority = 3)
    @Parameters({"url", "browserName" })
    public void Test(String url, String browser) {
        System.out.println("Running test in " + browser + " on " + url);
    }
}