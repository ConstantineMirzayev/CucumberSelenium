package Pages.com.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class SecondPage extends BasePage {

    @FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_19']//div[@class='a-section aok-relative s-image-fixed-height']")
    public  WebElement thirdItem;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCart;
    @FindBy(xpath = "//button[@class=' a-button-close a-declarative']")
    public WebElement closeButton;
    @FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
    public WebElement addedToCart;
    @FindBy(xpath = "//button [@class = ' a-button-close a-declarative']")
    public WebElement RecPopClose;
    @FindBy(xpath = "//span [@id ='attachSiNoCoverage-announce']")
    public WebElement NoThanks;


    //span [@id ='attachSiNoCoverage-announce']



}
