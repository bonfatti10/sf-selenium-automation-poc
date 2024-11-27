package com.bonfatti.catalogo.test.reward;

import com.bonfatti.catalogo.page.reward.CreateRewardGroupPage;
import com.bonfatti.catalogo.page.reward.CreateRewardPage;
import com.bonfatti.catalogo.test.BaseTest;
import com.bonfatti.catalogo.utils.TestResultExtension;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestResultExtension.class)
public class CreateRewardGroupTest extends BaseTest {

    private CreateRewardGroupPage createRewardGroupPage;
    private CreateRewardPage createRewardPage;

    @BeforeEach
    public void setUpTest() {
        createRewardGroupPage = new CreateRewardGroupPage(driver);
        createRewardPage = new CreateRewardPage(driver);
        TestResultExtension.setDriver(driver);
    }

    @Test
    @Description("Criar um novo grupo de recompensas ")
    public void createRewardGroupTest() throws InterruptedException {
        createRewardPage.clickBtnReward();
        createRewardGroupPage.clickBtnGroup();
        createRewardGroupPage.clickCreateNewGroup();
        createRewardGroupPage.fillDescription("GRUPO CRIADO POR TESTES AUTOMATIZADO");
        createRewardGroupPage.clickSelectPolicy();
        createRewardGroupPage.clickBtnSalvar();
        createRewardGroupPage.validatorCreatedRewardGroup("Ver grupo de recompensa");
    }
}
