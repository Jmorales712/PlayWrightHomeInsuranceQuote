package tests;

import base.BaseTest;
import com.microsoft.playwright.Playwright.*;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    @Test
    public void verifyTitle() {
        page.navigate("https://Google.com");

        System.out.println(page.title());
    }
}

