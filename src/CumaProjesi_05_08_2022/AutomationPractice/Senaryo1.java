package CumaProjesi_05_08_2022.AutomationPractice;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Senaryo1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://automationpractice.com/index.php");
        contactUs("Webmaster","aratj@gmail.com","879834","Hello world again");
        contactUs("Customer service","orkakgel@hotmail.com","3494","Hello to you too world");
        contactUs("Webmaster","kjhdgl@gmail.com","934643","Go away, it's enough");
        BekleKapat();
    }
    public static void contactUs(String subject,String emailAddress,String orderRef,String message) {
        WebElement contactus= driver.findElement(By.linkText("Contact us"));
        contactus.click();
        WebElement subjectHeading= driver.findElement(By.id("id_contact"));
        Select subjectSelect=new Select(subjectHeading);
        subjectSelect.selectByVisibleText(subject);
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys(emailAddress);
        WebElement order=driver.findElement(By.id("id_order"));
        order.sendKeys(orderRef);
        WebElement messageInput=driver.findElement(By.id("message"));
        messageInput.sendKeys(message);
        WebElement sendButton= driver.findElement(By.xpath("(//*[@class='icon-chevron-right right'])[3]"));
        sendButton.click();
        WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='alert alert-success']")));
        Assert.assertTrue(successMessage.getText().contains("successfully sent to our team"));
    }
}