package Odev_2022_07_19_Selenium_XPath.Soru03;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.snapdeal.com/");

        WebElement searchBox=driver.findElement(By.xpath("//*[@class='overlap']//following-sibling::input"));
        searchBox.sendKeys("teddy bear");
        searchBox.sendKeys(Keys.RETURN);


        WebElement searchResult= driver.findElement(By.xpath("//*[@id='searchMessageContainer']//following::span"));

        Assert.assertEquals("We've got 294 results for 'teddy bear'",searchResult.getText());

        BekleKapat();
    }
}
