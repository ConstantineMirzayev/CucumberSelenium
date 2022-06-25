package StepsDefenitions.com.amazon;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hook {

    WebDriver driver;

    @Before
    public void setUpDriver(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        Driver.closeDriver();

        if(scenario.isFailed()){
            System.out.println("TEST FAILED");
        }
    }
}
