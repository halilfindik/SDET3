package CumaProjesi_05_08_2022.DemoWebShop;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo_2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");
        WebElement logIn= driver.findElement(By.linkText("Log in"));
        logIn.click();
        WebElement emailInput= driver.findElement(By.id("Email"));
        emailInput.sendKeys("orasan@gmail.com"); // hatalı girildi
        WebElement passwordInput=driver.findElement(By.id("Password"));
        passwordInput.sendKeys("abc123456");
        WebElement loginButton=driver.findElement(By.cssSelector("[value='Log in']"));
        loginButton.click();
        WebElement unsuccessful1= driver.findElement(By.cssSelector("[class='validation-summary-errors']>span"));
        Assert.assertTrue(unsuccessful1.getText().contains("unsuccessful"));
        WebElement unsuccessful2= driver.findElement(By.cssSelector("[class='validation-summary-errors']>ul"));
        Assert.assertTrue(unsuccessful2.getText().contains("No customer"));
        BekleKapat();
    }
}
