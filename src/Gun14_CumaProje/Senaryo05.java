package Gun14_CumaProje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/*
-Navigate to "https://shopdemo.e-junkie.com/" website
-Click on 'Add to Cart' for 'Demo eBook'
-Click on 'Pay using Debit Card'
-Fill the Billing Details Form (use fake data)
-Enter Card number as "4242 4242 4242 4242"
-Enter Expiration as "12/22" and CVV as "000"
-Click on 'Pay' button
-Validate you navigate to the confirmation page and "Thank you!" message is displayed!
 */
public class Senaryo05 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCart = driver.findElement(By.xpath("(//*[@class='view_product'])[2]"));
        addToCart.click();
        driver.switchTo().frame(4);
        WebElement payUsingDebitCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Payment-Button CC']")));
        payUsingDebitCart.click();
//        List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
//        System.out.println(iframes.size());
//        for (WebElement i : iframes) {
//            System.out.println("i.getAttribute(\"class\") = " + i.getAttribute("name"));
//        }
        WebElement emailInput= driver.findElement(By.cssSelector("input[placeholder='Email']"));
        emailInput.sendKeys("krakow@gmail.com");
        WebElement confirmEmailInput= driver.findElement(By.cssSelector("input[placeholder='Confirm Email']"));
        confirmEmailInput.sendKeys("krakow@gmail.com");
        WebElement nameOnCardInput= driver.findElement(By.cssSelector("input[placeholder='Name On Card']"));
        nameOnCardInput.sendKeys("Wisla Krakow");
        WebElement frame= driver.findElement(By.xpath("(//iframe[starts-with(@name,'__privateStripeFrame')])[1]"));
        driver.switchTo().frame(frame);
        WebElement cardNumberInput = driver.findElement(By.cssSelector("[name='cardnumber']"));
        cardNumberInput.sendKeys("4242424242424242");
        WebElement expirayDateInput = driver.findElement(By.cssSelector("[name='exp-date']"));
        expirayDateInput.sendKeys("1222");
        WebElement cvcInput = driver.findElement(By.cssSelector("[name='cvc']"));
        cvcInput.sendKeys("000");

        driver.switchTo().parentFrame();
        WebElement payButton =driver.findElement(By.cssSelector("button[class='Pay-Button']"));
        payButton.click();

        Bekle(15);
        WebElement valid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='green_text_margin']")));

        Assert.assertTrue(valid.getText().contains("Thank you!"));
        Assert.assertEquals("Wisla, your order is confirmed. Thank you!", valid.getText());

        BekleKapat();
    }
}
