package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowSwitch extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String mainWindowID= driver.getWindowHandle(); // bulunduğun sayfanın ID'sini verir

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }

        Set<String> windowIDs = driver.getWindowHandles(); // açık olan tüm sayfaların ID'leri
        for (String id : windowIDs) {
            if (id.equals(mainWindowID)) continue;  // anasayfa haricindeki windowlarınkileri getirmek için
            driver.switchTo().window(id);
            System.out.println(id + " - Title = " + driver.getTitle());
        }


        Bekle(3);
        BekleKapat();
    }
}
