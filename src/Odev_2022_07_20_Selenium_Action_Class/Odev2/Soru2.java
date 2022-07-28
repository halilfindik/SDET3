package Odev_2022_07_20_Selenium_Action_Class.Odev2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        //List<WebElement> availableStudents= driver.findElements(By.cssSelector("[id^='node']")); // ilk for altına alınacak
        List<WebElement> targetBoxes= driver.findElements(By.cssSelector("[id^='box']"));
        Actions actions=new Actions(driver);

        for (WebElement i:targetBoxes)
        {
            List<WebElement> availableStudents=driver.findElements(By.xpath("//*[@id='allItems']//child::li"));
            System.out.println("availableStudents.size() = " + availableStudents.size());
            System.out.println("i.getText() = " + i.getAttribute("id"));
            for (WebElement j:availableStudents)
            {
                System.out.println("j.getText() = " + j.getText());
                actions.moveToElement(j).clickAndHold().perform(); Bekle(0.1);
                actions.moveToElement(i).perform();
                List<WebElement> mouseOver=driver.findElements(By.xpath("//*[@class='mouseover']"));
                System.out.println("mouseOver.size() = " + mouseOver.size());
                if (mouseOver.size()>0) {
                    actions.release(i).perform();
                } else break;
            }
        }
        BekleKapat();
    }
}
