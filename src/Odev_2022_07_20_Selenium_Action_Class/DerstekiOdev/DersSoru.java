package Odev_2022_07_20_Selenium_Action_Class.DerstekiOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DersSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        List<WebElement> rightBoxes=driver.findElements(By.xpath("//div[starts-with(@id,'box10')]"));
        WebElement dropBackLocation=driver.findElement(By.xpath("//*[@id='capitals']"));
        Actions actions=new Actions(driver);

        for (int i = 0; i < rightBoxes.size(); i++) {
            List<WebElement> leftBoxes=driver.findElements(By.cssSelector("div[class='dragableBox'][id^='box']:not([style='visibility: visible; background-color: rgb(0, 255, 0);'])"));
            for (int j = 0; j < leftBoxes.size(); j++) {
                actions.dragAndDrop(leftBoxes.get(j),rightBoxes.get(i)).build().perform();
                Bekle(0);
                WebElement draggedElement= driver.findElement(By.xpath("//div[@id='countries']//child::div["+(i+1)+"]//child::div"));
                if (draggedElement.getCssValue("background-color").equals("rgba(255, 255, 255, 1)"))
                {
                    actions.dragAndDrop(draggedElement,dropBackLocation).build().perform();
                    Bekle(0);
                } else break;
            }
        }
        BekleKapat();
    }
}
