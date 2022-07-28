package Odev_2022_07_20_Selenium_Action_Class.Odev3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        List<WebElement> countries= driver.findElements(By.cssSelector("[id^='box']"));
        List<WebElement> cities= driver.findElements(By.xpath("//*[@id='allItems']//child::li"));
        Actions actions=new Actions(driver);

        for (WebElement i:cities) {
            for (WebElement j:countries) {
                actions.moveToElement(i).clickAndHold().perform(); Bekle(0.1);
                actions.release(j).perform();
                try {
                    driver.switchTo().alert().accept();
                } catch (NoAlertPresentException a) {}
                if (i.getAttribute("class").equals("correctAnswer")) break;
                else {
                    actions.moveToElement(i).perform();}
            }
        }
        //driver.switchTo().alert().accept();
        System.out.println("Alert kapandı");
        BekleKapat();

    }
}
