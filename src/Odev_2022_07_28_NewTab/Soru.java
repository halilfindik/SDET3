package Odev_2022_07_28_NewTab;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        searchGoogle("social media websites");
        Bekle(2);
        List<WebElement> hub= driver.findElements(By.cssSelector("a[href]>h3"));
        hub.get(8).click();
        List<WebElement> socialMediaSites=driver.findElements(By.cssSelector("p[data-slot-rendered-dynamic]>a"));
        ArrayList<String> tabs=new ArrayList<>();
        for (WebElement i:socialMediaSites) {
            searchGoogle(i.getText());
            googleClickFirstResult();
        }

        /*
        driver.switchTo().newWindow(WindowType.TAB);
        String tab1=driver.getWindowHandle();
        driver.navigate().to("https://www.facebook.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        String tab2=driver.getWindowHandle();
        driver.navigate().to("https://twitter.com/");
        driver.switchTo().window(tabMain);
        */

        BekleKapat();
    }
    public static void searchGoogle(String s) {
        driver.get("https://www.google.com/");
        String tabMain= driver.getWindowHandle();
        WebElement searchBox= driver.findElement(By.cssSelector("[maxlength='2048']"));
        searchBox.sendKeys(s);
        searchBox.sendKeys(Keys.ENTER);
    }
    public static void googleClickFirstResult() throws AWTException {
        //Actions actions=new Actions(driver);
        //actions.sendKeys(Keys.)
        //actions.contextClick(driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]"))).perform();

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
}
