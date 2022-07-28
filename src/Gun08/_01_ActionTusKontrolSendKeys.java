package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        WebElement element= driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar
                .moveToElement(element)     // kutucuğua gittim
                .click()                    // içine tıklattım
                .keyDown(Keys.SHIFT)        // Shift'e bastım
                .sendKeys("a")              // a'ya bastım
                .keyUp(Keys.SHIFT)        // Shift'i bıraktım
                .sendKeys("hmet")
                .build();

        Bekle(2);
        aksiyon.perform();


        Bekle(3);
        BekleKapat();

    }
}
