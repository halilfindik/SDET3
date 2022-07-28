package Odev_2022_07_19_Selenium_XPath.Soru04;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateLink= driver.findElement(By.xpath("//*[text()='Calculate']"));
        calculateLink.click();
        WebElement input1=driver.findElement(By.xpath("//*[text()='The \"Selenium Simplified\" Calculator']//following::input"));

        input1.sendKeys("2");
        WebElement input2=driver.findElement(By.xpath("//*[text()='The \"Selenium Simplified\" Calculator']//following::input[2]"));

        input2.sendKeys("5");
        WebElement calculateButton= driver.findElement(By.xpath("//select//following-sibling::input[2]"));
        calculateButton.click();
        WebElement result= driver.findElement(By.xpath("//*[@id='answer']"));

        Assert.assertEquals("7", result.getText());

        BekleKapat();
    }
}
