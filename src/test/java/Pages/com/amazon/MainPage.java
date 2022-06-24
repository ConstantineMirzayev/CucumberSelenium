package Pages.com.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class MainPage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id ="nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(xpath ="//a[@aria-label='Go to page 2']")
    public WebElement secondPageButton;
}
