package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); //frame1

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().defaultContent(); // ilk ana sayfaya direk geri dön

        driver.switchTo().frame(1);
        WebElement selectButton= driver.findElement(By.id("animals"));
        Select ddMenu=new Select(selectButton);
        ddMenu.selectByIndex(ddMenu.getOptions().size()-1);

        BekleKapat();
    }
}
