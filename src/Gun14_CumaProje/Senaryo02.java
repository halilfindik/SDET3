package Gun14_CumaProje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/*
-Navigate to "https://shopdemo.e-junkie.com/" website
-Click on 'Add to Cart' for 'Demo eBook'
-Click on 'Add Promo Code' button and enter "123456789"
-Click on 'Apply'
-Validate "Invalid promo code" message is displayed!
 */

public class Senaryo02 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");
//        List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
//        System.out.println(iframes.size());
//        for (WebElement i:iframes) {
//            System.out.println("i.getAttribute(\"class\") = " + i.getAttribute("class"));
//        }
        WebElement addToCart= driver.findElement(By.xpath("(//*[@class='view_product'])[2]"));
        addToCart.click();
        driver.switchTo().frame(4);
        WebElement addPromoCode=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Add Promo Code']")));
        addPromoCode.click();
        WebElement promoCodeInput=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class=Promo-Code-Value]")));
        promoCodeInput.sendKeys("123456789");
        promoCodeInput.sendKeys(Keys.ENTER);
        WebElement snackBarResult=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id=SnackBar]>span")));

        Assert.assertTrue(snackBarResult.getText().contains("Invalid promo code"));

        BekleKapat();
    }
}
