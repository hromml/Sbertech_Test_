package ru.hromml.sbertech.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by hramkov on 03.03.2017.
 */
public class ApplicationManager {

    WebDriver wd;

    private NavigationClass navigationClass;
    private CheckingClass checkingClass;
    private ConditionsClass conditionsClass;
    public ApplicationManager() {
    }

    public void init() {
        System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
        wd = new InternetExplorerDriver();
//      System.setProperty("webdriver.chrome.driver", "src\test\resources\chromedriver.exe");  //тестил на хроме
//      wd = new ChromeDriver();
        pauseOneSecond();
        pauseOneSecond();
        pauseOneSecond();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigationClass = new NavigationClass(wd);
        checkingClass = new CheckingClass(wd);
        conditionsClass = new ConditionsClass(wd);
        wd.manage().window().maximize();
        openYandex();

    }


    public void openYandex() {
        wd.get("https://www.yandex.ru/");
    }

    public void pauseOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        wd.quit();
    }

    public NavigationClass getNavigationClass(){
        return navigationClass;
    }

    public CheckingClass getCheckingClass(){
        return checkingClass;
    }

    public ConditionsClass getConditionsClass(){
        return conditionsClass;
    }
}
