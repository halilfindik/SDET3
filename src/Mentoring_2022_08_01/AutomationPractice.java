package Mentoring_2022_08_01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

public class AutomationPractice extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://automationpractice.com/index.php");
        WebElement signIn = driver.findElement(By.partialLinkText("Sign in"));
        signIn.click();
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("horasanlim@gmail.com");
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("G!hDAwGw@ALi8dh");
        WebElement sendButton = driver.findElement(By.cssSelector("[class='icon-lock left']"));
        sendButton.click();
        WebElement homepage = driver.findElement(By.cssSelector("[class='logo img-responsive']"));
        homepage.click();

        JavascriptExecutor js=(JavascriptExecutor)driver;
        Actions actions=new Actions(driver);
        WebElement thirdDress=driver.findElement(By.xpath("(//*[@class='replace-2x img-responsive'])[3]"));
        js.executeScript("arguments[0].scrollIntoView()",thirdDress); // element'e kadar gitsin
        actions.moveToElement(thirdDress).perform();

        By proceed = By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]");

        WebElement thirdDressAddToCart = driver.findElement(By.xpath("(//*[text()='Add to cart'])[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(thirdDressAddToCart));
        thirdDressAddToCart.click();
        WebElement proceedToCheckOut1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Proceed to checkout')]")));
        proceedToCheckOut1.click();
        WebElement proceedToCheckOut2 = wait.until(ExpectedConditions.visibilityOfElementLocated(proceed));
        proceedToCheckOut2.click();
        WebElement proceedToCheckOut3 = wait.until(ExpectedConditions.visibilityOfElementLocated(proceed));
        proceedToCheckOut3.click();

        WebElement iAgree = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-cgv")));
        iAgree.click();
        WebElement proceedToCheckOut4 = driver.findElement(proceed);
        proceedToCheckOut4.click();
        WebElement payByWire = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Pay by bank wire']")));
        payByWire.click();
        WebElement iConfirmMyOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'I confirm my order')]")));
        iConfirmMyOrder.click();

        BekleKapat();

    }
}
