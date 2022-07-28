package Odev_2022_07_18_Selenium_CSS_Selector.Soru01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.navigate().to("http://demoqa.com/text-box");

        WebElement userNameBox= driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        userNameBox.sendKeys("Automation");

        WebElement emailBox=driver.findElement(By.cssSelector(".mt-2:nth-child(2) .mr-sm-2"));
        emailBox.sendKeys("Testing@gmail.com");

        WebElement addressBox= driver.findElement(By.cssSelector(".mt-2:nth-child(3) .form-control"));
        addressBox.sendKeys("Testing Current Address");

        WebElement permanentAddress=driver.findElement(By.cssSelector(".mt-2:nth-child(4) .form-control"));
        permanentAddress.sendKeys("Testing Current Address");

        WebElement submitButton=driver.findElement(By.cssSelector("div > button"));
        submitButton.click();

        WebElement outputName=driver.findElement(By.cssSelector("p:nth-child(1)"));
        WebElement outputEmail=driver.findElement(By.cssSelector("p:nth-child(2)"));

        System.out.println("outputName = " + outputName.getText());
        System.out.println("outputEmail = " + outputEmail.getText());
        if (outputName.getText().contains("Automation") && outputEmail.getText().contains("Testing@gmail.com"))
            System.out.println("Test Passed...");
        else System.out.println("Test Failed...");

        BekleKapat();
    }
}
