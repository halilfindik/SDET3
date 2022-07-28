package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import java.util.List;

public class _02_Senaryo extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement usernameInput= driver.findElement(By.xpath("//*[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        WebElement passwordInput= driver.findElement(By.xpath("//*[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
        WebElement loginButton= driver.findElement(By.xpath("//*[@id='login-button']"));
        loginButton.click();

        //WebElement backpack=driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack'"));
        WebElement backpack=driver.findElement(By.xpath("//*[@id='item_4_title_link']//child::div"));
        backpack.click();

        WebElement backpackAddToCart=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        backpackAddToCart.click();

        WebElement backToProducts=driver.findElement(By.xpath("//*[@class='left_component']//child::button"));
        backToProducts.click();

        WebElement tshirt=driver.findElement(By.xpath("//*[@id='item_1_title_link']//child::div"));
        tshirt.click();

        WebElement tshirtAddToCart=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        tshirtAddToCart.click();

        WebElement shoppingCart= driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        shoppingCart.click();

        WebElement checkout=driver.findElement(By.xpath("//*[@id='checkout']"));
        checkout.click();

        WebElement infoFirstName= driver.findElement(By.xpath("//*[@id='first-name']"));
        infoFirstName.sendKeys("Halil");
        WebElement infoLastName= driver.findElement(By.xpath("//*[@id='last-name']"));
        infoLastName.sendKeys("Fındık");
        WebElement infoPostalCode= driver.findElement(By.xpath("//*[@id='postal-code']"));
        infoPostalCode.sendKeys("İstanbul");

        WebElement continueButton=driver.findElement(By.xpath("//*[@id='continue']"));
        continueButton.click();

        List<WebElement> pricesList=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam=0;
        for (WebElement i:pricesList) {
            toplam+=Double.parseDouble(i.getText().substring(1));
        }

        WebElement altToplam=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        double altToplamDouble = Double.parseDouble(altToplam.getText().substring(13));

        System.out.println("toplam = " + toplam);
        System.out.println("altToplamDouble = " + altToplamDouble);

        Assert.assertTrue(toplam==altToplamDouble);
        //Assert.assertEquals(altToplamDouble,toplam);

        BekleKapat();

    }
}
