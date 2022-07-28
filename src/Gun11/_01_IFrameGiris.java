package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.lang.ref.WeakReference;

public class _01_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); //frame1
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input")); // ~ bitişik kardeş
        input.sendKeys("Türkiye");

        //driver.switchTo().parentFrame(); // geldiği yere geri dön (1 basamak geri git)
        driver.switchTo().defaultContent(); // ilk ana sayfaya direk geri dön



        BekleKapat();
    }
}
