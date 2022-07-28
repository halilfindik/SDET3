package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Calisma01 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/");

        //WebElement usernameBox= driver.findElement(By.id("user-name"));
        //WebElement usernameBox= driver.findElement(By.cssSelector("input[id='user-name']"));
        //WebElement usernameBox= driver.findElement(By.cssSelector("#user-name"));
        WebElement usernameBox= driver.findElement(By.cssSelector("input[data-test='username']"));
        usernameBox.sendKeys("standard_user"); Bekle(1);
        WebElement passwordBox= driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");
        WebElement loginButton= driver.findElement(By.id("login-button"));
        loginButton.click();




        BekleKapat();

    }
}
