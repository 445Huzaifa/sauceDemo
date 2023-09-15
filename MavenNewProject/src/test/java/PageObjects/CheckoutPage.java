package PageObjects;

import Utility.BasePage;
import org.openqa.selenium.By;


import static Utility.Hooks.driver;

public class CheckoutPage extends BasePage {

    private By checkoutButton = By.id("checkout");

    private By firstNameField = By.id("first-name");

    private By lastNameField = By.id("last-name");

    private By postalCodeField = By.id("c");

    private By clickContinue = By.id("continue");

    private By clickFinish = By.id("finish");

    public void clickCheckout() {
      click(checkoutButton);
    }
    public void firstName(String fName) {
        type(firstNameField, fName);
    }
    public void lastName(String lName) {
        type(lastNameField, lName);
    }
    public void postalCode(String postalCode) {
        type(postalCodeField, postalCode);
    }
    public void continueButton() {
        click(clickContinue);
    }
    public void finishButton() {
        click(clickFinish);
    }
}
