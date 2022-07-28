package Odev_2022_07_15_SeleniumBasics.Soru01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.navigate().to("http://demoqa.com/text-box");

        WebElement userNameBox= driver.findElement(By.id("userName"));
        userNameBox.sendKeys("Automation");

        WebElement emailBox=driver.findElement(By.id("userEmail"));
        emailBox.sendKeys("Testing@gmail.com");

        WebElement addressBox= driver.findElement(By.id("currentAddress"));
        addressBox.sendKeys("Testing Current Address");

        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Current Address");

        WebElement submitButton=driver.findElement(By.className("btn-primary"));
        submitButton.click();

        WebElement outputName=driver.findElement(By.id("name"));
        WebElement outputEmail=driver.findElement(By.id("email"));

        System.out.println("outputName = " + outputName.getText());
        System.out.println("outputEmail = " + outputEmail.getText());
        if (outputName.getText().contains("Automation") && outputEmail.getText().contains("Testing@gmail.com"))
            System.out.println("Test Passed...");
        else System.out.println("Test Failed...");

        BekleKapat();
    }
}
