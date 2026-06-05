package tests;

import java.util.*;
import java.util.regex.Pattern;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;

public class FullQuote extends BaseTest {
    @Test
    public void fullTest() {
        page.navigate("https://www.google.com/");

        page.getByRole(AriaRole.COMBOBOX,
                new Page.GetByRoleOptions().setName("Search")).click();

        page.getByRole(AriaRole.COMBOBOX,
                new Page.GetByRoleOptions().setName("Search")).fill("Kin Florida Home Insurance ");

        page.keyboard().press("Enter");

        page.getByText("Kin® Homeowners Insurance").click();

        page.getByRole(AriaRole.COMBOBOX,
                new Page.GetByRoleOptions().setName("Enter your property address")).click();

        page.getByRole(AriaRole.COMBOBOX,
                new Page.GetByRoleOptions().setName("Enter your property address")).fill("4692 Lucerne");

        page.getByText("4692 Lucerne Lakes Blvd E,").click();

        page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Get a quote")).click();

        page.getByRole(AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("First Name")).fill("Justin");

        page.getByRole(AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Last Name")).fill("Morales");

        page.getByRole(AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Date of birth")).fill("11181994");

        page.getByRole(AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Phone")).fill("9147550180");

        page.getByRole(AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Email")).fill("Justhemc@gmail.com");

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();

        page.waitForLoadState();

        System.out.println(page.title());



    }
}
