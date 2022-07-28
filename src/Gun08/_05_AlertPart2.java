package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz. */

public class _05_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html\n");

        WebElement clickMe2= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        clickMe2.click();

        driver.switchTo().alert().dismiss(); Bekle(2);



        BekleKapat();
    }
}
