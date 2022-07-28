package Odev_2022_07_19_Selenium_XPath.Soru01;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.navigate().to("http://demoqa.com/text-box");

        WebElement userNameBox= driver.findElement(By.xpath("(//*[@id='userName-wrapper']//following::div//child::input)[1]"));
        userNameBox.sendKeys("Automation");

        WebElement emailBox=driver.findElement(By.xpath("(//*[@id='userName-wrapper']//following::div[2]//child::input)[1]"));
        emailBox.sendKeys("Testing@gmail.com");

        WebElement addressBox= driver.findElement(By.xpath("//*[@id='userEmail-wrapper']//following::textarea"));
        addressBox.sendKeys("Testing Current Address");

        WebElement permanentAddress=driver.findElement(By.xpath("//*[@id='output']//preceding-sibling::div[2]//following::textarea"));
        permanentAddress.sendKeys("Testing Current Address");

        WebElement submitButton=driver.findElement(By.xpath("//*[@id='output']//preceding::button[1]"));
        submitButton.click();

        WebElement outputName=driver.findElement(By.xpath("//*[@id='output']//child::p[1]"));
        WebElement outputEmail=driver.findElement(By.xpath("//*[@id='output']//child::p[2]"));

        Assert.assertTrue(outputName.getText().contains("Automation"));
        Assert.assertTrue(outputEmail.getText().contains("Testing@gmail.com"));

        BekleKapat();
    }
}
