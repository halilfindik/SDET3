package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

public class _03_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.id("title"));
        name.sendKeys("Halil");
        WebElement description= driver.findElement(By.id("description"));
        description.sendKeys("Deneme");
        WebElement submitButton= driver.findElement(By.id("btn-submit"));
        submitButton.click();

        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),
                "Form submited Successfully!"));

        WebElement resultElement= driver.findElement(By.id("submit-control"));

        System.out.println("result.getText() = " + resultElement.getText());
        Assert.assertTrue(resultElement.getText().contains("submit"));

        BekleKapat();

    }
}
