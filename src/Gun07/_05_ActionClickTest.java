package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoqa.com/buttons");

        WebElement element= driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar=new Actions(driver);
        System.out.println("Aksiyon öncesi Aksiyonlar sınıfı oluşturuldu.");

        Action aksiyon=aksiyonlar.moveToElement(element).click().build();
        System.out.println("Aksiyon hazırlandı.");

        Bekle(2);
        aksiyon.perform();
        System.out.println("Aksiyon gerçekleştirildi.");
        // aksiyonlar.moveToElement(element).click().build().perfom(); // kısa hali



        BekleKapat();
    }
}
