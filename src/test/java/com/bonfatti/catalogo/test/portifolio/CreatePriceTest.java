package com.bonfatti.catalogo.test.portifolio;

import com.bonfatti.catalogo.page.portifolio.CreatePriceSinglePage;
import com.bonfatti.catalogo.page.portifolio.SeeBasePricePage;
import com.bonfatti.catalogo.test.BaseTest;
import com.bonfatti.catalogo.utils.TestResultExtension;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestResultExtension.class)
public class CreatePriceTest extends BaseTest {

    private CreatePriceSinglePage createPricePage;
    private SeeBasePricePage seeBasePrice;

    @BeforeEach
    public void setUpTest() {
        createPricePage = new CreatePriceSinglePage(driver);
        seeBasePrice = new SeeBasePricePage(driver);
    }
    @Test
    @Description("Criando preco single sem enviar para aprovacao e sem data inicio")
    public void testCreatePriceWithoutApproving() throws InterruptedException {
        createPricePage.clickBtnGroup();
        createPricePage.clickBtnListCatalogo();
        createPricePage.clickBtnListTier();
        createPricePage.clickBtnTier();
        createPricePage.clickBtnListGerenciar();
        createPricePage.clickBtnCreatePrice();
        createPricePage.selectDropdownOption();
        createPricePage.enterPrice("54,90");
        createPricePage.clickBtnProximo();
        createPricePage.clickBtnChanelWeb();
        createPricePage.clickBtnMoveWeb();
        createPricePage.clickCreditCard();
        createPricePage.clickMoveCreditCard();
        createPricePage.clickBtnVisa();
        createPricePage.clickBtnMoveVisa();
        createPricePage.clickBtnSalvar();
        createPricePage.assertValidatorText("Ver preço base");
    }

    @Test
    @Description("Criando preço single e enviando para aprovação com data inicio")
    public void testCreatePriceAndSendToAprove()  {
        createPricePage.clickBtnGroup();
        createPricePage.clickBtnListCatalogo();
        createPricePage.clickBtnListTier();
        createPricePage.clickBtnTier();
        createPricePage.clickBtnListGerenciar();
        createPricePage.clickBtnCreatePrice();
        createPricePage.selectDropdownOption();
        createPricePage.enterPrice("54,91");
        createPricePage.clickBtnProximo();
        createPricePage.clickBtnChanelWeb();
        createPricePage.clickBtnMoveWeb();
        createPricePage.clickCreditCard();
        createPricePage.clickMoveCreditCard();
        createPricePage.clickBtnVisa();
        createPricePage.clickBtnMoveVisa();
        createPricePage.clickBtnProximoVisa();
        createPricePage.selectDateStart();
        createPricePage.setToday();
        createPricePage.clickBtnSalvar();
        seeBasePrice.clickBtnEnviar();
        seeBasePrice.clickBtnOk();
        seeBasePrice.clickBtnSendApproval();
        seeBasePrice.clickBtnApproval();
        seeBasePrice.clickBtnConfirmationApproval();
        seeBasePrice.clickBtnFinancialApproval();
        seeBasePrice.assertTextAprovacaoFinanceiro("Aprovação de Financeiro");
    }
}
