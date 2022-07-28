package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        Bekle(3);
        WebElement element= driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        Bekle(2);

        driver.navigate().back();
        Bekle(2);

        driver.navigate().forward();
        BekleKapat();
    }
}
