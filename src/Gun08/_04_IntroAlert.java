package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html\n");

        WebElement clickMe1= driver.findElement(By.cssSelector("[class='btn btn-default']"));
        clickMe1.click();

        driver.switchTo().alert().dismiss(); Bekle(2);



        BekleKapat();
    }
}
