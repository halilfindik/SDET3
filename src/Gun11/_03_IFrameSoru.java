package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://chercher.tech/practice/frames");
        driver.switchTo().frame(0); //frame1

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);

        WebElement checkBox= driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement selectButton= driver.findElement(By.id("animals"));
        Select ddMenu=new Select(selectButton);
        ddMenu.selectByIndex(ddMenu.getOptions().size()-1);

        BekleKapat();
    }
}
