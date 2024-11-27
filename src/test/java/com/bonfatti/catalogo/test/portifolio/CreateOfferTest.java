package com.bonfatti.catalogo.test.portifolio;

import com.bonfatti.catalogo.page.portifolio.CreateOfferPage;
import com.bonfatti.catalogo.page.portifolio.CreatePriceSinglePage;
import com.bonfatti.catalogo.test.BaseTest;
import com.bonfatti.catalogo.utils.TestResultExtension;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestResultExtension.class)
public class CreateOfferTest extends BaseTest {

    private CreateOfferPage createOfferPage;
    private CreatePriceSinglePage createPricePage;

    @BeforeEach
    public void setUpTest() {
        createPricePage = new CreatePriceSinglePage(driver);
        createOfferPage = new CreateOfferPage(driver);
        TestResultExtension.setDriver(driver);
    }

    @Test
    @Description("Criando oferta sem enviar para aprovação")
    public void testCreateOffer() throws InterruptedException {
        createPricePage.clickBtnGroup();
        createPricePage.clickBtnListCatalogo();
        createPricePage.clickBtnListTier();
        createPricePage.clickBtnTier();
        createPricePage.clickBtnListGerenciar();
        createOfferPage.clickBtnSeeOffer();
        createOfferPage.clickBtnCreateOffer();
        createOfferPage.fillName("OFERTA CRIADA POR TESTES AUTOMATIZADO");
        createOfferPage.setStartDate();
        createOfferPage.setToday();
        createOfferPage.clickBtnPromoCode();
        createOfferPage.clickBtnMove();
        createOfferPage.clickBtnProximo();
        createOfferPage.setInputDiscount("5");
        createOfferPage.clickBtnSave();
        createOfferPage.validatorCreatedOffer("OFERTA CRIADA POR TESTES AUTOMATIZADO");
    }
}
