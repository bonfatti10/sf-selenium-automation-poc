package com.bonfatti.catalogo.page.reward;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateRewardGroupPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By btnRewardsGroup = By.xpath("//*[@id=\"group__item\"]");
    private By btnCreateNewGroup = By.xpath("//*[@id=\"tab-1\"]/slot/c-reward-group-list-cmp/div/div[1]/lightning-button/button");
    private By descriptionField = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/c-rewards-manager-cmp/lightning-tabset/div/slot/lightning-tab[1]/slot/c-reward-group-list-cmp/div/c-create-reward-group-cmp/div/div/div/fieldset[1]/div/div/div[1]/div/div/lightning-input/lightning-primitive-input-simple/div[1]/div/input");
    private By selectPolicy = By.xpath("//c-create-reward-group-cmp//button\n");
    private By selectPolicy4 = By.xpath("//lightning-base-combobox-item[.//span[text()='Resgates múltiplos por recompensa']]");
    private By btnSalvar = By.xpath("//*[@id=\"tab-1\"]/slot/c-reward-group-list-cmp/div/c-create-reward-group-cmp/div/div/div/fieldset[2]/div/div/div[2]/div/div/lightning-button/button");
    private By validatorMsg = By.xpath("//div[contains(@class, 'c-reward-group-list-cmp')]//p[text()='Ver grupo de recompensa']");

    // action
    public CreateRewardGroupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void clickBtnGroup() {
        wait.until(ExpectedConditions.elementToBeClickable(btnRewardsGroup)).click();
    }

    public void clickCreateNewGroup() {
        wait.until(ExpectedConditions.elementToBeClickable(btnCreateNewGroup)).click();
    }

    public void fillDescription(String description) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionField)).sendKeys(description);
    }

    public void clickSelectPolicy() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectPolicy)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectPolicy4)).click();
    }

    public void clickBtnSalvar() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSalvar)).click();
    }
    public void validatorCreatedRewardGroup(String expectedText) {
        try {
            String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(validatorMsg)).getText();
            assertEquals(expectedText, actualText);
        } catch (NoSuchElementException e) {
            System.err.println("Elemento não encontrado: " + e.getMessage());
        } catch (TimeoutException e) {
            System.err.println("Tempo de espera excedido para localizar o elemento: " + e.getMessage());
        }
    }


}
