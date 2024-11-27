package com.bonfatti.catalogo.page.portifolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateOfferPage {

    private WebDriver driver;
    private WebDriverWait wait;


    // Locators
    private By btnSeeOffer = By.xpath("//lightning-tab[1]//c-plan-portfolio-list//c-plan-portfolio-item[1]//lightning-card//table//tr[2]//td[8]//lightning-button/button\n");

    private By btnCreateOffer = By.xpath("//button[@title='Criar nova oferta']\n");
    private By nameField = By.xpath("//input[@class='slds-input' and @name='nome']\n");
    private By descriptionField = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-offer-form/div[2]/div/");
    private By startDate = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-offer-form/div[2]/div/fieldset[2]/div/div/div[1]/div/div/l");
    private By btnToday = By.xpath("//button[@name='today']");
    private By btnPromoCode = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-offer-form/div[2]/div/fieldset[4]/div/div/div/div/div/lightning-dual-listbox/div/div[2]/div/div[3]/div/ul/li[2]/div/span[1]");
    private By btnMove = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/div/c-create-offer-form/div[2]/div/fieldset[4]/div/div/div/div/div/lightning-dual-listbox/div/div[2]/div/div[4]/lightning-button-icon[1]/button/lightning-primitive-icon");
    private By btnProximo = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-offer-form/div[2]/div/fieldset[6]/div/div/div[2]/lightning-button/button");
    private By inputDiscount = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-offer-form/div[2]/div/fieldset[2]/div/div[2]/div[2]/div/div/lightning-input/lightning-primitive-input-simple/div/div/input");
    private By btnSave = By.xpath("//*[text()='Salvar']\n");
    private By createdOffer = By.xpath("//td/div[contains(text(), 'OFERTA CRIADA POR TESTES AUTOMATIZADO')]\n");
    public CreateOfferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void clickBtnSeeOffer() {
        wait.until(ExpectedConditions.elementToBeClickable(btnSeeOffer)).click();
    }

    public void clickBtnCreateOffer() {
        if (wait.until(ExpectedConditions.visibilityOfElementLocated(btnCreateOffer)).isDisplayed()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            wait.until(ExpectedConditions.elementToBeClickable(btnCreateOffer)).click();
        } else {
            System.out.println("O botão 'Criar Oferta' não está visível.");
        }
    }

    public void fillName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(name);
    }

    public void fillDescription(String description) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionField)).sendKeys(description);
    }

    public void setStartDate() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(startDate)).click();
    }

    public void setToday() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnToday)).click();
    }

    public void clickBtnPromoCode() {
        wait.until(ExpectedConditions.elementToBeClickable(btnPromoCode)).click();
    }

    public void clickBtnMove() {
        wait.until(ExpectedConditions.elementToBeClickable(btnMove)).click();
    }
    public void clickBtnProximo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnProximo)).click();
    }
    public void setInputDiscount(String discount) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputDiscount)).sendKeys(discount);
    }
    public void clickBtnSave() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSave)).click();
    }
    public void validatorCreatedOffer(String expectedText) {
        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(createdOffer)).getText();
        assertEquals(expectedText, actualText);
    }

}

