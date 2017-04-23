package ru.hromml.sbertech.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by HROM on 22.04.2017.
 */
public class NavigationClass extends HelperClass {

    public NavigationClass(WebDriver wd) {
        super(wd);
    }

    public void openSearchConditions(){
        click(By.xpath(".//*[@class=\"n-filter-panel-aside__controls\"]/div[2]/a"));
    }

    public void openYandexMarket(){
        click(By.xpath(".//*[@id='wd-_services']/div/ul/li[1]/a[1]"));
    }

    public void openComputersCategory(){
        click(By.xpath("html/body/div/div[2]/noindex/ul/li[2]/a"));
    }

    public void openNotePadInComputerCategory(){
        click(By.xpath("html/body/div/div[4]/div[1]/div/div[1]/div/a[1]"));
    }
}
