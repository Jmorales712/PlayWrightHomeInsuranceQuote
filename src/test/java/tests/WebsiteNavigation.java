package tests;

import base.BaseTest;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;
import org.testng.annotations.Test;

public class WebsiteNavigation extends BaseTest {
    @Test
    public void googleSearch() {
        page.navigate("https://google.com");

        page.context().cookies();

        page.getByRole(AriaRole.COMBOBOX).
                fill("Florida Home Insurance");

        page.keyboard().press("Enter");

        page.waitForLoadState(LoadState.NETWORKIDLE);

        page.getByText("Delray Beach Home Insurance")
                .click();

        System.out.println("Website Navigation done");
    }

}
