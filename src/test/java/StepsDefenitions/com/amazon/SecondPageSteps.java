package StepsDefenitions.com.amazon;
import Pages.com.amazon.SecondPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SecondPageSteps {
    SecondPage SecondPage = new SecondPage();
    @And("The User Click Third Item on List")
    public void the_user_click_on_third_item() {
        SecondPage.thirdItem.click();
    }
    @Then("User Verify If item would be available for purchase")
    public void item_would_be_available_for_addToCard(){
        SecondPage.addToCart.click();
    }

}
