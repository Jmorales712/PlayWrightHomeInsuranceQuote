package tests;

import jdk.internal.net.http.common.*;
import base.BaseTest;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;
import org.testng.annotations.Test;

import static jdk.internal.net.http.common.Utils.close;

public class StartQuote extends BaseTest {
    @Test
    public void Quotestart() {
// Make sure to await close, so that videos are saved.
        page.navigate("https://google.com");

        page.context().cookies();

        page.getByRole(AriaRole.COMBOBOX).
                fill("Kin Florida Home Insurance");

        page.keyboard().press("Enter");

        page.waitForLoadState(LoadState.NETWORKIDLE);

        page.getByText("Delray Beach Home Insurance").click();

        page.getByRole(AriaRole.COMBOBOX)
                .fill("4692 Lucerne Lakes Blvd E, Lake Worth, FL 33467");

        page.keyboard().press("Enter");

        System.out.println("Start Quote Completed");
    }

}
