package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html\n");

        Bekle(2);
        WebElement clickMe1=driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        WebElement result=driver.findElement(By.id("prompt-demo"));
        clickMe1.click();

        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("ismet");
        driver.switchTo().alert().accept();
        Bekle(2);

        Assert.assertTrue(result.getText().contains("ismet"));

        BekleKapat();
    }
}
