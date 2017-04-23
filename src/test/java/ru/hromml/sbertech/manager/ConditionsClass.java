package ru.hromml.sbertech.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by HROM on 22.04.2017.
 */
public class ConditionsClass extends HelperClass {

    public ConditionsClass(WebDriver wd) {
        super(wd);
    }

    public void setPriceConditions(String minprice, String maxprice){
        type(By.xpath(".//*[@id='glf-pricefrom-var']"),minprice);
        type(By.xpath(".//*[@id='glf-priceto-var']"),maxprice);
    }

    public void applySearchConditions(){
        click(By.xpath(".//*[@class=\"n-filter-panel-extend__button-bar\"]/a[2]"));
    }

    public void chooseBrandCondition(String brandname){
        pauseOneSecond();
        click(By.xpath(".//*[@class=\"n-filter-block__list n-filter-block__list_type_more more-list__top i-bem\"]/button"));
        pauseOneSecond();
        type(By.xpath(".//*[@class=\"n-filter-block__list n-filter-block__list_type_more more-list__top i-bem n-filter-block__list_js_inited\"]/span/span/input"),brandname);
        pauseOneSecond();
        click(By.xpath(".//*[@class=\"n-filter-block__item i-bem n-filter-block__item_js_inited\"]/span/label"));
    }

}
