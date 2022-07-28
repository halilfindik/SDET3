package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://formsmarts.com/form/yu?mode=h5");

        WebElement businessClick=driver.findElement(By.cssSelector("input[id^=u_1fG]"));
        businessClick.click();
        Bekle(3);
        WebElement xyzSelector= driver.findElement(By.cssSelector("select[name^=u_1fG]"));
        xyzSelector.click();
        Bekle(3);
        //WebElement xyzOption= driver.findElement(By.cssSelector());
        Bekle(3);
        BekleKapat();

    }
}
