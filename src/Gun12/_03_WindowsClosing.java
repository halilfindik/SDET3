package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/*
   1- https://www.selenium.dev/  sayfasına gidiniz
   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız(mailto hariç)
   3- Açılan bütün yeni sayfaları teer teker kapatınız
 */

public class _03_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        List<WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']:not([href='mailto:selenium@sfconservancy.org'])"));

        for (WebElement link:links) {
            link.click();
        }

        Set<String> windows=driver.getWindowHandles();

        for (String s:windows) {
            driver.switchTo().window(s);
            driver.close();
        }
    }
}
