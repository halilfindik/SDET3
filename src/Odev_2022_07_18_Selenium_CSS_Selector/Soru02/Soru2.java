package Odev_2022_07_18_Selenium_CSS_Selector.Soru02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://demo.applitools.com/");

        WebElement username=driver.findElement(By.cssSelector(/*"div:nth-child(1) > input"*/".form-group>[type='text']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.cssSelector(/*"div:nth-child(2) > input"*/".form-group>[type='password']"));
        password.sendKeys("techno123.");

        WebElement signInButton=driver.findElement(By.cssSelector("form > div > a"));
        signInButton.click();

        WebElement output=driver.findElement(By.cssSelector("div:nth-child(1) > h6:nth-child(2)"));

        if (output.getText().equals("Your nearest branch closes in: 30m 5s"))
            System.out.println("Test Passed...");
        else System.out.println("Test Failed...");

        BekleKapat();
    }
}
