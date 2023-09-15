package StepDefinition;

import PageObjects.LogoutPage;
import io.cucumber.java.en.And;

public class LogoutStepDef {

    LogoutPage logout = new LogoutPage();

    @And("Click on menu button and logout")
    public void clickLogOut(){
        logout.menuButton();
        logout.logoutButton();
    }
}
