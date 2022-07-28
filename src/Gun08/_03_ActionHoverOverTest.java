package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");

        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        WebElement jewellery= driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement necklaces= driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibNecklaces= driver.findElement(By.id("catnav-l3-10881"));
        Actions actions=new Actions(driver);

        actions.moveToElement(jewellery).build().perform(); Bekle(1);
        actions.moveToElement(necklaces).build().perform(); Bekle(1);
        actions.moveToElement(bibNecklaces).click().build().perform();

        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));
        BekleKapat();
    }
}
