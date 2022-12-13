package CumaProjesi_05_08_2022.DemoWebShop;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo_1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");
        WebElement logIn= driver.findElement(By.linkText("Log in"));
        logIn.click();
        WebElement emailInput= driver.findElement(By.id("Email"));
        emailInput.sendKeys("horasan@gmail.com");
        WebElement passwordInput=driver.findElement(By.id("Password"));
        passwordInput.sendKeys("abc123456");
        WebElement loginButton=driver.findElement(By.cssSelector("[value='Log in']"));
        loginButton.click();
        WebElement success= driver.findElement(By.linkText("horasan@gmail.com"));
        Assert.assertTrue(success.getText().contains("horasan@gmail.com"));
        BekleKapat();
    }
}
