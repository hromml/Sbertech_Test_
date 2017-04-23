package ru.hromml.sbertech.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by HROM on 22.04.2017.
 */
public class CheckingClass extends HelperClass {

    public CheckingClass(WebDriver wd) {
        super(wd);
    }

    public void checkingSearchResault(){
        String searchingtext=wd.findElement(By.xpath(".//*[@class=\"snippet-list snippet-list_type_vertical island metrika i-bem snippet-list_js_inited metrika_js_inited\"]/div[2]/div[3]/div/div[1]/div/h3/a/span")).getText();
        type(By.xpath(".//*[@id='header-search']"),searchingtext);
        click(By.xpath(".//*[@class=\"header2__search search2 search2_type_market suggest2-form suggest2-counter suggest2-form_stats_yes i-bem search2_js_inited suggest2-counter_js_inited suggest2-form_js_inited\"]/span[2]/button"));
        pauseOneSecond();
        pauseOneSecond();
        String resulttext=wd.findElement(By.xpath(".//*[@class=\"n-product-summary__headline\"]/div/div[1]/h1")).getText();
        pauseOneSecond();
        if (checkingResultsOfSearching(searchingtext,resulttext)){
            System.out.println("Success!");
        } else {
            System.out.println("False!");
        };

    }
}
