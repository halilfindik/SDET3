package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_FindingByClassName extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.className("form-submit-button"));
        System.out.println(element.getText());

        WebElement element2=driver.findElement(By.className("form-sub-label"));
        System.out.println(element2.getText()); // FindElement birden fazla eleman var ise ilkini getirir

        List<WebElement> liste= driver.findElements(By.className("form-sub-label"));
        System.out.println("liste.size() = " + liste.size());
        for (WebElement e:liste)
            System.out.println("e.getText() = " + e.getText());

        List<WebElement> liste2= driver.findElements(By.className("form-sub-label2"));
        System.out.println("liste2.size() = " + liste2.size());
        for (WebElement e:liste2)
            System.out.println("e.getText() = " + e.getText());


        BekleKapat();
    }
}
