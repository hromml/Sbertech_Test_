package ru.hromml.sbertech.manager;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Created by hramkov on 06.03.2017.
 */
public class HelperClass {
    protected WebDriver wd;
    public void pauseOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public HelperClass(WebDriver wd) {
        this.wd=wd;
    }

    protected void click(By locate) {                                                           // method, that clicks on something (using locate)
        wd.findElement(locate).click();
    }

    protected void type(By locate, String text) {                                               // method, that fills needed field (using locate and text)
        wd.findElement(locate).clear();
        wd.findElement(locate).sendKeys(text);
        pauseOneSecond();
     }

    public  boolean checkingTwoStrings(String s1,String s2){
        return s1.equals(s2);
    }

    public boolean checkingResultsOfSearching(String resault1, String resault2){
        try{
            Assert.assertTrue(checkingTwoStrings(resault1,resault2));
            return true;
        } catch (java.lang.AssertionError e){
            return false;
        }

    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}
