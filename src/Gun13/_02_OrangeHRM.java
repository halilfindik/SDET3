package Gun13;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class _02_OrangeHRM extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("admin");
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin12");
        WebElement submitButton= driver.findElement(By.id("btnLogin"));
        submitButton.click();

        List<WebElement> spanMessage=driver.findElements(By.id("spanMessage"));
        if (spanMessage.size()>0) { // login olamadın hata ekran görüntüsünü saklayalım
            // Hata ekranının screenshot'ını alalım
            System.out.println("Login olamadı çünkü hata mesajı göründü.");

            // Ekran kaydını alalım

            TakesScreenshot ts=(TakesScreenshot) driver; // aynı javascripexecutor'da yaptığımız gibi; 1. Aşama
            File ssDosya=ts.getScreenshotAs(OutputType.FILE);  // 2. Aşama - Saklama tipi seçildi, data (veritabanı) (Byte)
            FileUtils.copyFile(ssDosya, new File("ScreenShots", SSDateTimeFileName()));
        }
        // TODO: Ödev buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin - DONE
        // TODO: mesela 202207282108.jpg gibi - DONE
        BekleKapat();
    }
}
