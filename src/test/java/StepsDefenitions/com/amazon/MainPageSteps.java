package StepsDefenitions.com.amazon;
import Pages.com.amazon.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.PropertiesReader;
public class MainPageSteps {
    static WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    @Given("the user navigates to amazon web page")
    public void the_user_navigates_to_amazon_web_page() {
        driver.navigate().to(PropertiesReader.URL.getProperty("amazon"));
    }
    @When("the user click on search button")
    public void the_user_click_on_search_button() {
        mainPage.searchButton.click();
    }
    @And("press on Second Page Button")
    public void the_user_press_2_page_button() {
        mainPage.secondPageButton.click();
    }
    @When("the user types {string} in search box")
    public void theUserTypesInSearchBox(String str) {
        mainPage.searchBox.sendKeys(str);

    }
}
