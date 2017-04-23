package ru.hromml.sbertech.tests;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by HROM on 22.04.2017.
 */
@Description("This tests for sbertech")
public class SearchingAndCheckingTests extends TestBase{
    @Title("Checking the second product's name and the title of it after searching")
    @Test
    public void test1(){
        applicationManager.getNavigationClass().openYandexMarket();
        applicationManager.getNavigationClass().openComputersCategory();
        applicationManager.getNavigationClass().openNotePadInComputerCategory();
        applicationManager.pauseOneSecond();
        applicationManager.getNavigationClass().openSearchConditions();
        applicationManager.getConditionsClass().setPriceConditions("20000","25000");
        applicationManager.getConditionsClass().chooseBrandCondition("Acer");
        applicationManager.getConditionsClass().applySearchConditions();
        applicationManager.pauseOneSecond();
        applicationManager.getCheckingClass().checkingSearchResault();
    }

    @Title("Searching non-existent brand - expected failed")
    @Test
    public void test2(){
        applicationManager.getNavigationClass().openYandexMarket();
        applicationManager.getNavigationClass().openComputersCategory();
        applicationManager.getNavigationClass().openNotePadInComputerCategory();
        applicationManager.pauseOneSecond();
        applicationManager.getNavigationClass().openSearchConditions();
        applicationManager.getConditionsClass().setPriceConditions("20000","25000");
        applicationManager.getConditionsClass().chooseBrandCondition("idfhiodhafid");
        applicationManager.getConditionsClass().applySearchConditions();
        applicationManager.pauseOneSecond();
        applicationManager.getCheckingClass().checkingSearchResault();
    }

}
