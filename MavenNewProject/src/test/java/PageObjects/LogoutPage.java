package PageObjects;

import Utility.BasePage;
import org.openqa.selenium.By;

public class LogoutPage extends BasePage {

    public By clickMenuButton = By.id("react-burger-menu-btn");

    public By clickLogout = By.id("logout_sidebar_link");

    public void menuButton() {
        click(clickMenuButton);
    }
    public void logoutButton() {
        waitUntilElementVisible(clickLogout);
        click(clickLogout);
    }
}
