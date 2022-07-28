package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_SendText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement element= driver.findElement(By.partialLinkText("No, thanks!"));
        element.click();

        WebElement txtBox=driver.findElement(By.id("user-message"));
        txtBox.sendKeys("Merhaba Selenium");

        WebElement btn= driver.findElement(By.className("btn-default"));
        btn.click();

        WebElement msg=driver.findElement(By.id("display"));
        if (msg.getText().contains("Merhaba Selenium")) {
            System.out.println("Test Passed...");
        } else System.out.println("Test Failed...");

        BekleKapat();
    }
}
