package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

// Scroll kaydırmanın 4 farklı yöntemi var
/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */

public class _04_ScrollIntro extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");
        // Javascript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        // (0,1500) - > (x,y) sağa x kadar ve aşağı y kadar kaydırır.
        // 1500 pixel kadar aşağı kaydırır

        Bekle(2);
        js.executeScript("window.scrollBy(0,-500)");

        BekleKapat();
    }
}
