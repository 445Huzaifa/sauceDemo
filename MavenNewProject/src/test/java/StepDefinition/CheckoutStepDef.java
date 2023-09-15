package StepDefinition;

import PageObjects.CheckoutPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutStepDef {
    CheckoutPage checkout = new CheckoutPage();

    @Then("User clicks on checkout button")
    public void clicks_checkoutButton(){
        checkout.clickCheckout();
    }

    @And("User enters fName {string} lName {string} and postalCode {string}")
    public void entersInfo(String fName, String lName, String postalCode){
        checkout.firstName(fName);
        checkout.lastName(lName);
        checkout.postalCode(postalCode);
    }

    @Then("User clicks on continue button")
    public void clickContinue(){
     checkout.continueButton();
    }

    @Then("User clicks on finish button")
    public void clickFinish(){
        checkout.finishButton();
    }
}
