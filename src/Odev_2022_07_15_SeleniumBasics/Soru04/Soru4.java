package Odev_2022_07_15_SeleniumBasics.Soru04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateLink= driver.findElement(By.linkText("Calculate"));
        calculateLink.click();
        WebElement input1=driver.findElement(By.id("number1"));
        //int number1= (int) (Math.random()*10);
        //input1.sendKeys(Integer.toString(number1));
        input1.sendKeys("2");
        WebElement input2=driver.findElement(By.id("number2"));
        //int number2= (int) (Math.random()*10); Bekle(3);
        //input1.sendKeys(Integer.toString(number2));
        input2.sendKeys("5");
        WebElement calculateButton= driver.findElement(By.id("calculate"));
        calculateButton.click();
        WebElement result= driver.findElement(By.id("answer"));
        System.out.println("result = " + result.getText());

        BekleKapat();
    }
}
