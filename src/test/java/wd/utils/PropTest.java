package wd.utils;

import org.testng.annotations.Test;

import java.io.IOException;

public class PropTest {
    @Test
    static void propTest() throws IOException {
        System.out.println(TestProperties.getProperty("url"));
    }
}
