package Pages.com.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class SecondPage extends BasePage {

    @FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_19']//div[@class='a-section aok-relative s-image-fixed-height']")
    public  WebElement thirdItem;

    @FindBy(xpath = "//span[@id='submit.add-to-cart']")
    public WebElement addToCart;
}
