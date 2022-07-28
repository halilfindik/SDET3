package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectEbayOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.ebay.com/");
        WebElement ddmenu= driver.findElement(By.id("gh-cat"));
        Select menu=new Select(ddmenu);

        menu.selectByValue("14339");

        Bekle(2);
        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));

        BekleKapat();
    }
}
