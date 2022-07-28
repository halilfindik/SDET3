package Odev_2022_07_18_Selenium_CSS_Selector.Soru06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru6 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement alertLink= driver.findElement(By.linkText("Fake Alerts"));
        alertLink.click(); Bekle(3);
        WebElement modalDialogBox= driver.findElement(By.id("modaldialog"));
        modalDialogBox.click(); Bekle(3);
        WebElement okBox= driver.findElement(By.id("dialog-ok"));
        okBox.click();

        BekleKapat();
    }
}
