package PageObjects;

import Utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Utility.Hooks.driver;


public class LoginPage extends BasePage {

//    WebDriver driver;

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public void enterUserId(String userID) {
        By[] enterID = {usernameField};
        for (By i : enterID) {
            type(i, userID);
        }
    }
    public void enterPassword(String userPass) {
        By[] enterID = {passwordField};
        for (By i : enterID) {
            type(i, userPass);
        }
    }
    public void clickLogin() {
        By[] click_Login = {loginButton};
        for (By i : click_Login) {
            click(i);
        }
    }
    public void clickCart(String addProduct) {
        WebElement productLink = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-" + addProduct + "']"));
        productLink.click();
    }
    public void clickCart2 (String addProduct2) {
        WebElement productLink = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-" + addProduct2 + "']"));
        productLink.click();
    }
    public void clickRemove(String removeProduct) {
        WebElement productLink = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-" + removeProduct + "']"));
        productLink.click();
    }
    public void clickShoppingCart(){
        driver.findElement(By.id("shopping_cart_container")).click();
    }
    public void verifyCarts(){
        WebElement cartItemList = driver.findElement(By.xpath("//div[@class='cart_list']//div[@class='cart_item']"));
        System.out.println("Available products in the shopping cart:");
        System.out.println(cartItemList.getText());

    }
}







