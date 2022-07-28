package Odev_2022_07_20_Selenium_Action_Class.Odev1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> leftBoxes=driver.findElements(By.xpath("//*[@class='destinationBox' and not(contains(@id,'answerDiv'))]")); // 15 hedef kutu
        WebElement dropBackLocation=driver.findElement(By.cssSelector("div[id=answerDiv]")); // hatalı ise geri bırakma yeri
        Actions actions=new Actions(driver);

        for (WebElement i:leftBoxes)
        {
            List<WebElement> rightBoxes=driver.findElements(By.xpath("//*[@id='answerDiv']//child::div"));
            for (WebElement j:rightBoxes) {
                actions.moveToElement(j).clickAndHold().perform(); Bekle(0.1);
                actions.release(i).perform();
                if (j.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) break;
                else {
                    actions.moveToElement(i).clickAndHold().perform(); Bekle(0.1);
                    actions.release(dropBackLocation).perform();
                }
            }
        }
        BekleKapat();
    }
}
