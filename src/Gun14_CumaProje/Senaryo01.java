package Gun14_CumaProje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/*
Navigate to "https://shopdemo.e-junkie.com/”
-Click on 'Add to Cart' for 'Demo eBook'
-Validate cart item no is '1'
-Click on 'Remove' button to remove item from your cart
-Click on 'Continue Shopping'
-Validate cart item no is '0'
 */
public class Senaryo01 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

//        List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
//        System.out.println(iframes.size());
//        for (WebElement i:iframes) {
//            System.out.println("i.getAttribute(\"class\") = " + i.getAttribute("class"));
//        }

        // frame 0
        // frame 1
        //      frame 0
        //      frame 1
        // frame 2
        // frame 3

        WebElement addToCart= driver.findElement(By.xpath("(//*[@class='view_product'])[2]"));
        addToCart.click();
        driver.switchTo().frame(4);

        WebElement dogrulama =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='Cart-Items-Nos'])[2]")));
        Assert.assertTrue(dogrulama.getText().contains("1"));

        WebElement remove = driver.findElement(By.cssSelector("button[class='Product-Remove']"));
        remove.click();
        WebElement continueShoppingButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Continue-Button Close-Cart']")));
        continueShoppingButton.click();
        driver.switchTo().defaultContent();
        WebElement cartItemNo=driver.findElement(By.xpath("(//*[@id='cart_item_nos'])[2]"));

        Assert.assertTrue(cartItemNo.getText().contains("0"));

        BekleKapat();

    }
}
