package Odev_2022_07_15_SeleniumBasics.Soru02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://demo.applitools.com/");

        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("techno123.");

        WebElement signInButton=driver.findElement(By.id("log-in"));
        signInButton.click();

        WebElement output=driver.findElement(By.id("time"));

        if (output.getText().equals("Your nearest branch closes in: 30m 5s"))
            System.out.println("Test Passed...");
        else System.out.println("Test Failed...");

        BekleKapat();
    }
}
