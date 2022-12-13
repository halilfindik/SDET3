package CumaProjesi_05_08_2022.DemoWebShop;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Senaryo_3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");
        WebElement logIn = driver.findElement(By.linkText("Log in"));
        logIn.click();
        WebElement emailInput = driver.findElement(By.id("Email"));
        emailInput.sendKeys("horasan@gmail.com");
        WebElement passwordInput = driver.findElement(By.id("Password"));
        passwordInput.sendKeys("abc123456");
        WebElement loginButton = driver.findElement(By.cssSelector("[value='Log in']"));
        loginButton.click();

        WebElement laptop = driver.findElement(By.xpath("(//*[@value='Add to cart'])[2]"));
        laptop.click();
        WebElement cart = driver.findElement(By.linkText("Shopping cart"));
        cart.click();
        WebElement aggreeTerms = driver.findElement(By.id("termsofservice"));
        aggreeTerms.click();
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        WebElement country = driver.findElement(By.cssSelector("[data-val-required='Country is required.']"));
        Select countryList = new Select(country);
        countryList.selectByValue("77");
        WebElement city = driver.findElement(By.cssSelector("[data-val-required='City is required']"));
        city.sendKeys("Istanbul");
        WebElement address = driver.findElement(By.cssSelector("[data-val-required='Street address is required']"));
        address.sendKeys("Bahcelievler");
        WebElement postalCode = driver.findElement(By.cssSelector("[data-val-required='Zip / postal code is required']"));
        postalCode.sendKeys("34343");
        WebElement phoneNumber = driver.findElement(By.cssSelector("[data-val-required='Phone is required']"));
        phoneNumber.sendKeys("89498450954");
        Bekle(2);
        WebElement continueButton1 = driver.findElement(By.xpath("(//*[@title='Continue'])[1]"));
        continueButton1.click();
        WebElement continueButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@title='Continue'])[2]")));
        continueButton2.click();
        WebElement continueButton3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='button-1 shipping-method-next-step-button']")));
        continueButton3.click();
        WebElement continueButton4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='button-1 payment-method-next-step-button']")));
        continueButton4.click();
        WebElement continueButton5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='button-1 payment-info-next-step-button']")));
        continueButton5.click();
        WebElement confirmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='button-1 confirm-order-next-step-button']")));
        confirmButton.click();
        WebElement confirmMessage=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));

        Assert.assertTrue(confirmMessage.getText().contains("success"));

        BekleKapat();

    }
}
