package com.bonfatti.catalogo.page.portifolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatePriceSinglePage {
    private WebDriver driver;
    private WebDriverWait wait;


    // Locators
    private By btnGroup = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/c-portfolio-item-card-list/div/c-portfolio-item-card[1]/div/lightning-card/article/div[3]/slot/div/h6/a");
    private By btnListCatalogo = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/c-portfolio-item-card-list/div/c-portfolio-item-card[1]/div/lightning-card/article/div[3]/slot/div/h6/a");

    private By btnListTier = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/c-portfolio-item-card-list/div/c-portfolio-item-card/div/lightning-card/article/div[3]/slot/div/h6/a");

    private By btnTier = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/c-portfolio-item-card-list/div/c-portfolio-item-card/div/lightning-card/article/div[3]/slot/div/h6/a");
    private By btnListGerenciar = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/div/c-service-level-manager-cmp/div/div[1]/lightning-card/article/div[3]/slot/div");
    private By btnCreatePrice = By.xpath("//c-plan-portfolio-item[1]//lightning-button/button");
    private By dropdownButton = By.xpath("//button[span[contains(text(), 'Selecionar Região')]]");
    private By dropdownOption = By.xpath("//span[contains(text(), 'Brasil (BRL)')]");
    private By inputPrice = By.xpath("//input[@class='slds-input' and @name='basePrice' and @inputmode='decimal' and @type='text']");

    private By btnProximo = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/div/c-create-price-form/div/fieldset/div/div/div[2]/lightning-button/button");

    private By btnChanelWeb = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-price-form/div/div[2]/fieldset[1]/div/div/div[1]/div/div/lightning-dual-listbox/div/div[2]/div/div[3]/div/ul/li/div/span/span");

    private By btnMoveChanel = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/div/c-create-price-form/div/div[2]/fieldset[1]/div/div/div[1]/div/div/lightning-dual-listbox/div/div[2]/div/div[4]/lightning-button-icon[1]/button/lightning-primitive-icon");

    private By btnCreditCard = By.xpath("//div[@role='option']//span[@class='slds-truncate' and @title='Cartão de Crédito']/ancestor::div[@role='option']\n");

    private By btnMoveCreditCard = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-price-form/div/div[2]/fieldset[1]/div/div/div[2]/div/div/lightning-dual-listbox/div/div[2]/div/div[4]/lightning-button-icon[1]/button/lightning-primitive-icon");

    private By btnVisa = By.xpath("//c-create-price-form//fieldset[2]//lightning-dual-listbox//ul/li[2]/div\n");
    private By btnMoveVisa = By.xpath("//c-create-price-form//fieldset[2]//lightning-dual-listbox//div/div[2]/div/div[4]/lightning-button-icon[1]/button\n");

    private By btnProximovisa = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/div/c-create-price-form/div/fieldset/div/div/div[2]/lightning-button/button");

    private By inputDateStart = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-price-form/div/div[2]/fieldset[1]/div/div/div[1]/div/div[2]/lightning-input/lightning-datetimepicker/div/fieldset/div[1]/div/div/lightning-datepicker/div/div/input");
    private By btnToday = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/c-portfolio-manager/lightning-tabset/div/slot/lightning-tab[1]/slot/div/div[2]/div/c-create-price-form/div/div[2]/fieldset[1]/div/div/div[1]/div/div[2]/lightning-input");
    private By btnSalvar = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/div/c-create-price-form/div/fieldset/div/div/div[2]/lightning-button/button");
    private By btnEnviar = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/div/c-base-price-form/div/fieldset/div/div[5]/div/lightning-card/article/div[1]/header/div[2]/slot/lightning-button/button");
    private By validatorText = By.xpath("//*[@id=\"tab-1\"]/slot/div/div[2]/c-portfolio-breadcumb/div/div/p/text()");


    public CreatePriceSinglePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void clickBtnGroup() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnGroup)).click();
    }

    public void clickBtnListCatalogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnListCatalogo)).click();
    }

    public void clickBtnListTier() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnListTier)).click();
    }

    public void clickBtnTier() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnTier)).click();
    }

    public void clickBtnListGerenciar() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnListGerenciar)).click();
    }

    public void clickBtnCreatePrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnCreatePrice)).click();
    }

    public void selectDropdownOption() {
        driver.findElement(dropdownButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownOption)).click();
    }

    public void enterPrice(String price) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPrice)).sendKeys(price);
    }

    public void clickBtnProximo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnProximo)).click();
    }

    public void clickBtnChanelWeb() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnChanelWeb)).click();
    }

    public void clickBtnMoveWeb() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnMoveChanel)).click();
    }

    public void clickCreditCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnCreditCard)).click();
    }

    public void clickMoveCreditCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnMoveCreditCard)).click();
    }

    public void clickBtnVisa() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnVisa)).click();
    }
    public void clickBtnMoveVisa() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnMoveVisa)).click();
    }

    public void clickBtnProximoVisa() {
        WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(btnProximovisa));
        element.click();
    }

    // Método para selecionar a data
    public void selectDateStart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputDateStart)).click();
    }

    public void setToday(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnToday)).click();
    }

    public void clickBtnSalvar() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(btnSalvar));

        element.click();

        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

    public void assertValidatorText(String expectedText) {
        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(validatorText)).getText();
        assertEquals(expectedText, actualText);
    }
}
