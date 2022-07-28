package Odev_2022_07_19_Selenium_XPath.Soru02;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://demo.applitools.com/");

        WebElement username=driver.findElement(By.xpath("//*[text()='Username']//following::input"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.xpath("//*[text()='Password']//following::input"));
        password.sendKeys("techno123.");

        WebElement signInButton=driver.findElement(By.xpath("//*[@class='form-check-label']//preceding::a[1]"));
        signInButton.click();

        WebElement output=driver.findElement(By.xpath("//*[@class='element-wrapper compact pt-4']//child::h6"));

        Assert.assertEquals("Your nearest branch closes in: 30m 5s", output.getText());

        BekleKapat();
    }
}
