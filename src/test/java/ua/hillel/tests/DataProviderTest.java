package ua.hillel.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "userProvider")
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
            {"userName", "userPass", "user"},
            {"adminName", "adminPass", "admin"},
            {"guestName", "guestPass", "guest"},
    };
            return users;
            }
    }
