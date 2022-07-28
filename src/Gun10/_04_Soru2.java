package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
public class _04_Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement galaxy= driver.findElement(By.linkText("Samsung galaxy s6"));
        galaxy.click();
        WebElement addToCart= driver.findElement(By.cssSelector("[class='btn btn-success btn-lg']"));
        addToCart.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        WebElement home= driver.findElement(By.cssSelector("[class='navbar-brand']"));
        home.click();

        BekleKapat();
    }
}
