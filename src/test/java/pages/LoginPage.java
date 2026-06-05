package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;
    private final String usernameTextboxLoginPage = " ";
    private final String passwordTextboxLoginPage = " ";
    private final String loginButton = " ";


    public LoginPage (Page page){
        this.page = page;

    }
}
