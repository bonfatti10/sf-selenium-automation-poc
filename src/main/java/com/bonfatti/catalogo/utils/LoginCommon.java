package com.bonfatti.catalogo.utils;

import com.bonfatti.catalogo.page.LoginPage;
import com.bonfatti.catalogo.runner.RunBase;
import org.openqa.selenium.WebDriver;

public class LoginCommon {
    private WebDriver driver;
    private LoginPage loginPage;
    public LoginCommon() {
        this.driver = RunBase.getDriver();
        this.driver.get("https:qa.my.salesforce.com/");
        this.loginPage = new LoginPage(driver);
    }

    public void performLogin(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }


}
