package com.bonfatti.catalogo.test;

import com.bonfatti.catalogo.runner.RunBase;
import com.bonfatti.catalogo.utils.LoginCommon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = RunBase.getDriver();
        LoginCommon login = new LoginCommon();
        login.performLogin("username", "password");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Fecha o navegador
        }

    }

}
