package Gun14_CumaProje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
-Navigate to "https://shopdemo.e-junkie.com/" website
-Click on 'Add to Cart' for 'Demo eBook'
-Click on 'Pay using Debit Card'
-Click on 'Pay' button without filling any information
-Validate "Invalid Email - Invalid Email - Invalid Billing Name" message is displayed!
 */
public class Senaryo03 extends BaseStaticDriver {
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
        WebElement payUsingDebitCart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Payment-Button CC']")));
        payUsingDebitCart.click();
        WebElement payButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Pay-Button']")));
        payButton.click();
        WebElement invalid=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#SnackBar>span")));

        Assert.assertTrue(invalid.getText().contains("Invalid Email"));
        BekleKapat();
    }
}
