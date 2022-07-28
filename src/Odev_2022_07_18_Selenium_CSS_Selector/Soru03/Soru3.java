package Odev_2022_07_18_Selenium_CSS_Selector.Soru03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.snapdeal.com/");

        WebElement searchBox=driver.findElement(By.cssSelector("div:nth-child(2) > input:nth-child(2)"));
        searchBox.sendKeys("teddy bear");
        searchBox.sendKeys(Keys.RETURN);

        try {
            WebElement searchResult= driver.findElement(By.cssSelector("div:nth-child(6) > div > span"));
            if (searchResult.getText().equals("We've got 296 results for 'teddy bear'"))
                System.out.println("Test Passed...");
            else System.out.println("Test Failed...");
        } catch (Exception ex) {
        System.out.println("Hata oluştu : " + ex.getMessage().toLowerCase()); }

        BekleKapat();
    }
}
