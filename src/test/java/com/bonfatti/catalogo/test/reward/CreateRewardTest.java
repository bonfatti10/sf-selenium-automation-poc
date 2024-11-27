package com.bonfatti.catalogo.test.reward;

import com.bonfatti.catalogo.page.reward.CreateRewardPage;
import com.bonfatti.catalogo.test.BaseTest;
import com.bonfatti.catalogo.utils.TestResultExtension;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestResultExtension.class)
public class CreateRewardTest extends BaseTest {
    private CreateRewardPage createRewardPage;

    @BeforeEach
    public void setUpTest() {
        createRewardPage = new CreateRewardPage(driver);
        TestResultExtension.setDriver(driver);
    }

    @Test
    @Description("Criar uma nova de recompensas ")
    public void createRewardTest() throws InterruptedException {
        createRewardPage.clickBtnReward();
        createRewardPage.clickBtnCreateNewReward();
        createRewardPage.fillDescription("Criado por teste automatizado");
        createRewardPage.selectType(createRewardPage.coletiva);
        createRewardPage.clickIpuntButton();
        Thread.sleep(10000);
    }
    @Test
    @Description("Criar uma nova recompensa do tipo 'Individual'")
    public void createRewardIndividualTest() throws InterruptedException {
        createRewardPage.clickBtnReward();
        createRewardPage.clickBtnCreateNewReward();
        createRewardPage.fillDescription("Criado por teste automatizado");
        createRewardPage.selectType(createRewardPage.individual);
        createRewardPage.clickSelectOffer();
        createRewardPage.clickSelectGroup("B3");
        Thread.sleep(3000);
        createRewardPage.clickBtnSave();
        createRewardPage.assertValidator("Recompensas");
    }

}
