package StepDefinition;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static Utility.Hooks.driver;

public class LoginStepDef {
    LoginPage login = new LoginPage();

    @Given("User enters username {string} and password {string}")
    public void User_enter_username(String userID, String userPass) {
        login.enterUserId(userID);
        login.enterPassword(userPass);
    }

    @And("User clicks login button")
    public void click_loginButton() {
        login.clickLogin();
    }

    @Then("User selects the product {string} to add to the cart")
    public void user_selectsProduct(String addProduct){
        login.clickCart(addProduct);
    }
    @Then("User selects another product {string} to add to the cart")
    public void selectsAnotherProduct(String addProduct2) {
        login.clickCart2(addProduct2);
    }

    @Then("User removes the product {string}")
    public void user_removesProduct(String removeProduct){
        login.clickRemove(removeProduct);

    }

    @And ("User verify the products under the cart")
    public void verify_Products(){
        login.clickShoppingCart();
        login.verifyCarts();

     }

}
