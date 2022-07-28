package Odev_2022_07_15_SeleniumBasics.Soru05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement alertLink= driver.findElement(By.linkText("Fake Alerts"));
        alertLink.click(); Bekle(3);
        WebElement alertBox= driver.findElement(By.id("fakealert"));
        alertBox.click(); Bekle(3);
        WebElement okBox= driver.findElement(By.id("dialog-ok"));
        okBox.click();

        BekleKapat();
    }
}
