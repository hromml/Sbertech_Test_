package ru.hromml.sbertech.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.hromml.sbertech.manager.ApplicationManager;

/**
 * Created by hramkov on 02.03.2017.
 */
public class TestBase {

    protected final ApplicationManager applicationManager= new ApplicationManager();

   @BeforeMethod
   public void setUp() throws Exception {
               applicationManager.init();
    }

    @AfterMethod
    public void tearDown() {
        applicationManager.stop();
    }

    public ApplicationManager getApplicationManager() {
        return applicationManager;
    }
}
