package Mentoring_2022_07_25;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//TODO 1.https://www.akakce.com/ sitesinde bir hesap açınız
//TODO 2.Sitenin açılıp açılmadığını kontrol ediniz
//TODO  *** E-posta için gerçek bir hesap olmasına gerek yok
//TODO  *** Şifre 8 karakterli büyük , küçük harf ve rakam içermelidir
//TODO 3.Hesap açma işlemi tamamlandıktan sonra doğru hesabın açılıp açılmadığını kontrol ediniz
//TODO 4.Profil sayfanızı açınız ve Siparişlerim butonuna tıklayınız
//TODO 5.Siparişinizin olmadığını doğrulayın
//TODO 6.Profil sayfanızı açınız ve Mesajlarım butonuna tıklayınız
//TODO 7.Mesajınızın olmadığını doğrulayınız
//TODO 8.Anasayfayada Sıcak Fırsatlara tıklayınız
//TODO 9.Açılan sayfada 5. Ürünün tüm fiyatları gör butonuna tıklayınız
//TODO 10.Sıralama türü olarak Satıcı Puanı nı seçiniz
public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.akakce.com/");

        WebElement signUp=driver.findElement(By.cssSelector("[rel='nofollow']"));
        WebElement nameInput=driver.findElement(By.cssSelector("[id='rnufn']"));
        WebElement surnameInput=driver.findElement(By.cssSelector("[id='rnufs']"));
        WebElement emailInput=driver.findElement(By.cssSelector("[id='rnufe1']"));
        WebElement emailReInput=driver.findElement(By.cssSelector("[id='rnufe2']"));
        WebElement passwordInput=driver.findElement(By.cssSelector("[id='rnufp1']"));
        WebElement passwordReInput=driver.findElement(By.cssSelector("[id='rnufp2']"));
        WebElement sexInput=driver.findElement(By.cssSelector("[id='rngm']"));
        WebElement cityInput=driver.findElement(By.cssSelector("[id='locpr']"));
        Select city=new Select(cityInput);
        city.selectByValue("34");
        WebElement districtInput=driver.findElement(By.cssSelector("[id='locds']"));
        Select district=new Select(districtInput);
        district.selectByValue("13");











        BekleKapat();
    }
}
