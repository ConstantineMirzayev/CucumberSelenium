package StepsDefenitions.com.amazon;
import Pages.com.amazon.SecondPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SecondPageSteps {
    SecondPage SecondPage = new SecondPage();
    @And("The User Click Third Item on List")
    public void the_user_click_on_third_item() {
        SecondPage.thirdItem.click();
    }

    @And("User Verify If item {string} and would be available for purchase")
    public void item_would_be_available_for_addToCard(String str){
        SecondPage.addToCart.click();
        try {
            SecondPage.closeButton.click();
            SecondPage.RecPopClose.click();
            SecondPage.NoThanks.click();
        } catch (Exception e) {
            System.out.println("Emotional Damage.");
        }

        Assert.assertEquals(str, SecondPage.addedToCart.getText());
    }
 }

