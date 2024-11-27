package com.bonfatti.catalogo.page.reward;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateRewardPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By btnRewards = By.xpath("//html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[4]\n");
    private By btnCreateNewReward = By.xpath("//button[@title='Criar nova recompensa' and @type='button']");
    private By descriptionField = By.xpath("//input[@class='slds-input' and @name='name' and @type='text']");
    private By inputButton = By.xpath("//input[@placeholder='Selecione a oferta']");
    private By btnType = By.xpath("//button[@aria-label='Tipo' and @role='combobox']");
    private By selectOffer = By.xpath("//input[@placeholder='Selecione a oferta']");
    private By selectedOffer = By.xpath("//span[contains(@class, 'slds-truncate') and contains(text(), 'FL-FL-BS-SD-M-WB-BR-BP0943-OF1212')]");
    private By selectGroup = By.xpath("//input[@placeholder='Selecione o grupo']");
    private By selectedGroup = By.xpath("//*[@id=\"tab-21\"]/slot/c-rewards-list-cmp/div/c-create-reward-cmp/div[2]/div/div/fieldset[2]/div/div/div[2]/div/div/ul/li[3]/div");

    public By coletiva = By.xpath("//span[@class='slds-truncate' and @title='Coletiva']");
    public By individual = By.xpath("//span[@class='slds-truncate' and @title='Individual']");

    public By btnSave = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/c-rewards-manager-cmp/lightning-tabset/div/slot/lightning-tab[2]/slot/c-rewards-list-cmp/div/c-create-reward-cmp/div[2]/div/div/fieldset[4]/div/div/div[2]/div/div/lightning-button/button");
    private By createdReawardValidator = By.xpath("//*[@id=\"tab-21\"]/slot/c-rewards-list-cmp/div/p[1]/b");

    public CreateRewardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void clickBtnReward() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnRewards)).click();
    }

    public void clickBtnCreateNewReward() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnCreateNewReward)).click();
    }


    public void selectType(By elementType) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnType)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementType)).click();
    }

    public void clickIpuntButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputButton)).click();
    }

    public void fillDescription(String description) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionField)).sendKeys(description);
    }

    public void clickSelectOffer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectOffer)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectedOffer)).click();
    }

    public void clickSelectGroup(String group) {
            wait.until(ExpectedConditions.elementToBeClickable(selectGroup)).sendKeys(group);
    }

    public void clickBtnSave() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSave)).click();
    }
    public void assertValidator(String expectedText) {
        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(createdReawardValidator)).getText();
        assertEquals(expectedText, actualText);
    }
}
