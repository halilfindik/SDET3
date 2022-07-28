package Odev_2022_07_18_Selenium_CSS_Selector.Soru04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateLink= driver.findElement(By.cssSelector("ul:nth-child(15) > li:nth-child(7) > a"));
        calculateLink.click();
        WebElement input1=driver.findElement(By.cssSelector("input:nth-child(1)"));

        input1.sendKeys("2");
        WebElement input2=driver.findElement(By.cssSelector("input:nth-child(3)"));

        input2.sendKeys("5");
        WebElement calculateButton= driver.findElement(By.cssSelector("input:nth-child(4)"));
        calculateButton.click();
        WebElement result= driver.findElement(By.cssSelector("span"));
        System.out.println("result = " + result.getText());

        BekleKapat();
    }
}
