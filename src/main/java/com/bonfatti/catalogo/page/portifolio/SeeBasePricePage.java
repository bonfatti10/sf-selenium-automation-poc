package com.bonfatti.catalogo.page.portifolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeeBasePricePage {

    private WebDriver driver;
    private WebDriverWait wait;

    //locators
    private By btnEnviar = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-base-price-form/div/fieldset/div/div[5]/div/lightning-card/article/div[1]/header/div[2]/slot/lightning-button/button");
    private By btnOk = By.xpath("/html/body/lightning-overlay-container/div/lightning-interactive-dialog-base/lightning-focus-trap/slot/section/div/div[3]/button[2]");
    private By btnSendApproval = By.xpath("/html/body/lightning-overlay-container/div/lightning-interactive-dialog-base/lightning-focus-trap/slot/section/div/div[3]/button[2]");
    private By btnApproval = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-base-price-form/div/fieldset/div/div[5]/div/c-approval-process-view-cmp/");
    private By confirmationApproval = By.xpath("/html/body/lightning-overlay-container/div/lightning-interactive-dialog-base/lightning-focus-trap/slot/section/div/div[3]/button[2]");
    private By btnfinancialApproval = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]");
    private By textAprovacaoFinanceiro = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/div/c-base-price-form/div/fieldset/div/div[5]/div/c-approval-process-view-cmp/lightning-card/article/div[2]/slot/div/div[2]/lightning-card/article/div[1]/header/div[2]/h2/span/slot/div");

    //action
    public SeeBasePricePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void clickBtnEnviar() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnEnviar)).click();
    }

    public void clickBtnOk() {
        WebElement okButton = wait.until(ExpectedConditions.visibilityOfElementLocated(btnOk));
        Actions actions = new Actions(driver);
        actions.moveToElement(okButton).click().perform();
    }

    public void clickBtnSendApproval() {
        WebElement okButton = wait.until(ExpectedConditions.visibilityOfElementLocated(btnSendApproval));
        Actions actions = new Actions(driver);
        actions.moveToElement(okButton).click().perform();
    }

    public void clickBtnApproval() {
        WebElement okButton = wait.until(ExpectedConditions.visibilityOfElementLocated(btnApproval));
        Actions actions = new Actions(driver);
        actions.moveToElement(okButton).click().perform();
    }

    public void clickBtnConfirmationApproval() {
        WebElement okButton = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationApproval));
        Actions actions = new Actions(driver);
        actions.moveToElement(okButton).click().perform();
    }

    public void clickBtnFinancialApproval() {
        WebElement okButton = wait.until(ExpectedConditions.visibilityOfElementLocated(btnfinancialApproval));
        Actions actions = new Actions(driver);
        actions.moveToElement(okButton).click().perform();
    }

    public void assertTextAprovacaoFinanceiro(String expectedText) {
        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(textAprovacaoFinanceiro)).getText();
        assertEquals(expectedText, actualText);
    }
}
